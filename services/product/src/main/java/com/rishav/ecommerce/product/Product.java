package com.rishav.ecommerce.product;

import com.rishav.ecommerce.category.Category;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @Column(name = "available_quantity")
    private double availableQuantity;

    private BigDecimal price;

    private BigDecimal rating; // numeric(2,1)

    private Integer stock;

    private String thumbnail;

    @Column(columnDefinition = "jsonb")
    private String images; // Store JSON as string or use a JSON type mapping

    private String brand;

    @ManyToOne(fetch = FetchType.LAZY) // Lazy to avoid N+1 queries
    @JoinColumn(name = "category_id")
    private Category category;
}
