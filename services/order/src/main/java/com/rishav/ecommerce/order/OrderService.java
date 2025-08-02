package com.rishav.ecommerce.order;

import com.rishav.ecommerce.customer.CustomerClient;
import com.rishav.ecommerce.exception.BusinessException;
import com.rishav.ecommerce.kafka.OrderConfirmation;
import com.rishav.ecommerce.kafka.OrderProducer;
import com.rishav.ecommerce.orderline.OrderLineRequest;
import com.rishav.ecommerce.orderline.OrderLineService;
import com.rishav.ecommerce.payment.PaymentClient;
import com.rishav.ecommerce.payment.PaymentRequest;
import com.rishav.ecommerce.product.ProductClient;
import com.rishav.ecommerce.product.PurchaseRequest;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderMapper mapper;
    private final OrderRepository repository;
    private final OrderLineService orderLineService;
    private final OrderProducer orderProducer;
    private final PaymentClient paymentClient;

    public Long createOrder(@Valid OrderRequest request) {
        // 1️⃣ Validate customer
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot create order:: No Customer exists with the provided ID"));

        // 2️⃣ Purchase products from Product Service
        var purchasedProducts = this.productClient.purchaseProducts(request.products());

        // 3️⃣ Save Order
        var order = this.repository.save(mapper.toOrder(request));

        // 4️⃣ Save Order Lines
        for (PurchaseRequest productRequest : request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(), // convert Long → Integer if needed
                            productRequest.productId(),
                            productRequest.quantity()
                    )
            );
        }

        // 5️⃣ Trigger payment
        var paymentRequest = new PaymentRequest(
                request.amount(),
                request.paymentMethod(),
                order.getId(),
                order.getReference(),
                customer
        );
        paymentClient.requestOrderPayment(paymentRequest);

        // 6️⃣ Send Kafka confirmation
        orderProducer.sendOrderConfirmation(
                new OrderConfirmation(
                        request.reference(),
                        request.amount(),
                        request.paymentMethod(),
                        customer,
                        purchasedProducts
                )
        );

        return order.getId();
    }

    public List<OrderResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::fromOrder)
                .collect(Collectors.toList());
    }

    public OrderResponse findById(Long orderId) {
        return repository.findById(orderId)
                .map(mapper::fromOrder)
                .orElseThrow(() -> new EntityNotFoundException(
                        String.format("No order found with the provided ID: %d", orderId)
                ));
    }
}
