package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "FOOD_RATES", schema = "ZOO")
public class FoodRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private int id;
    @Column(name = "animal", length = 64, updatable = false)
    private String animal;
    @Column(name = "product", length = 64, updatable = false)
    private String product;
    @Column(name = "rate")
    private Long rate;
    @Column(name = "unit", length = 64, updatable = false)
    private String unit;
}
