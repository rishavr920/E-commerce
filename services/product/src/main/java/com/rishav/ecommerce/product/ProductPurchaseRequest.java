package com.rishav.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductPurchaseRequest(
        @NotNull(message = "Product ID is mandatory")
        Long productId,

        @NotNull(message = "Quantity is mandatory")
        @Positive(message = "Quantity should be positive")
        double quantity
) {
}
