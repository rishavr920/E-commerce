package com.rishav.ecommerce.order;

import org.springframework.stereotype.Service;

@Service
public class OrderMapper {

    public Order toOrder(OrderRequest request) {
        return Order.builder()
                .id(request.id()) // Long type
                .customerId(request.customerId())
                .reference(request.reference())
                .totalAmount(request.amount()) // clearer naming
                .paymentMethod(request.paymentMethod())
                .build();
    }

    public OrderResponse fromOrder(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getReference(),
                order.getTotalAmount(),
                order.getPaymentMethod(),
                order.getCustomerId(),
                order.getCreatedAt(),
                order.getLastModifiedDate()
        );
    }
}
