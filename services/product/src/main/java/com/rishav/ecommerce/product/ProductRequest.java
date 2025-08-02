package com.rishav.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProductRequest(
        Long id,

        @NotNull(message = "Product name is required")
        String name,

        @NotNull(message = "Product description is required")
        String description,

        @Positive(message = "Available quantity should be positive")
        double availableQuantity,

        @Positive(message = "Price should be positive")
        BigDecimal price,

        @Positive(message = "Rating should be positive")
        BigDecimal rating,

        @Positive(message = "Stock should be positive")
        Integer stock,

        String thumbnail,

        String images, // JSON as string

        String brand,

        @NotNull(message = "Product category is required")
        Long categoryId
) {
}
