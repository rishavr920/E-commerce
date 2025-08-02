package com.rishav.ecommerce.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderResponse(
        Long id,
        String reference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        String customerId,
        LocalDateTime createdAt,
        LocalDateTime lastModifiedDate
) {
}
