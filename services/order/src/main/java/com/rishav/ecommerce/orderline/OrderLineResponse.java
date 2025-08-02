package com.rishav.ecommerce.orderline;

public record OrderLineResponse(
        Long id,
        Long productId,
        double quantity,
        Long orderId
) {
}
