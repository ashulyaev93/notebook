package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "ANIMALS", schema = "ZOO")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animal_id", nullable = false, unique = true, updatable = false)
    private int animalId;
    @Column(name = "name", length = 64, updatable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="kind", nullable=false)
    private KindAnimals kindAnimals;
    @ManyToOne
    @JoinColumn(name="hunter", nullable=false)
    private PredatorSign predatorSign;
    @OneToMany
    @JoinColumn(name = "animal_id")
    private Set<FoodRate> foodRates;
}
