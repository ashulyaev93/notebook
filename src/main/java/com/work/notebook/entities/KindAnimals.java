package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "KIND_ANIMALS", schema = "ZOO")
public class KindAnimals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private int id;
    @Column(name = "kind", length = 64, updatable = false)
    private String kind;
    @OneToMany
    @JoinColumn(name = "kind")
    private Set<Animal> animals;
}
