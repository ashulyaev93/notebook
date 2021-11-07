package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FOOD_RATE", schema = "ZOO")
public class FoodRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name="animal_id", nullable=false)
    private Animal animal;
    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;
    @Column(name = "rate")
    private Long rate;
    @Column(name = "unit", length = 64, updatable = false)
    private String unit;
}
