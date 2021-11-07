package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "TYPE_PRODUCT", schema = "ZOO")
public class TypeProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private int id;
    @Column(name = "type", length = 64, updatable = false)
    private String kind;
    @OneToMany
    @JoinColumn(name = "type")
    private Set<Product> products;
}
