package com.rishav.ecommerce.kafka;

import com.rishav.ecommerce.customer.Customer;
import com.rishav.ecommerce.customer.CustomerResponse;
import com.rishav.ecommerce.order.PaymentMethod;
import com.rishav.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
