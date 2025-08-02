package com.rishav.ecommerce.orderline;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record OrderLineRequest(

        Long id, // Matches OrderLine.id

        @NotNull(message = "Order ID is mandatory")
        Long orderId, // Matches Order.id

        @NotNull(message = "Product ID is mandatory")
        Long productId, // Matches Product.id

        @Positive(message = "Quantity must be positive")
        double quantity
) {}
