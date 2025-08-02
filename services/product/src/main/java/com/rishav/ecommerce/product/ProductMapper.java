package com.rishav.ecommerce.product;

import com.rishav.ecommerce.category.Category;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        return Product.builder()
                .id(request.id())
                .name(request.name())
                .description(request.description())
                .price(request.price())
                .availableQuantity(request.availableQuantity())
                .rating(request.rating())
                .stock(request.stock())
                .thumbnail(request.thumbnail())
                .images(request.images())  // JSON as string
                .brand(request.brand())
                .category(Category.builder()
                        .id(request.categoryId())
                        .build())
                .build();
    }

    public ProductResponse toProductResponse(Product product) {
        Category category = product.getCategory(); // Lazy-loaded

        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getAvailableQuantity(),
                product.getPrice(),
                product.getRating(),
                product.getStock(),
                product.getThumbnail(),
                product.getImages(),
                product.getBrand(),
                category != null ? category.getId() : null,
                category != null ? category.getName() : null,
                category != null ? category.getDescription() : null
        );
    }

    public ProductPurchaseResponse toProductPurchaseResponse(Product product,
                                                             @NotNull(message = "Quantity is mandatory") double quantity) {
        return new ProductPurchaseResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                quantity
        );
    }
}
