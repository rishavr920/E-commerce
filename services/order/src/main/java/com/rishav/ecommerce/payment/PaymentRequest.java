package com.rishav.ecommerce.payment;

import com.rishav.ecommerce.customer.Customer;
import com.rishav.ecommerce.customer.CustomerResponse;
import com.rishav.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Long orderId,
        String orderReference,
        CustomerResponse customer
) {
}
