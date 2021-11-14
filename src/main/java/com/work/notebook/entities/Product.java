package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "PRODUCTS", schema = "ZOO")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, unique = true, updatable = false)
    private int productId;

    @Column(name = "name", length = 64, updatable = false)
    private String name;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "unit", length = 64, updatable = false)
    private String unit;

    @Column(name = "type", length = 64, updatable = false)
    private String typeProduct;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "product_id")
    private List<FoodRate> foodRates = new ArrayList<>();
}
