package com.rishav.ecommerce.product;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,

        String name,

        String description,

        double availableQuantity,

        BigDecimal price,

        BigDecimal rating,

        Integer stock,

        String thumbnail,

        String images, // JSON as string

        String brand,

        Long categoryId,

        String categoryName,

        String categoryDescription
) {
}
