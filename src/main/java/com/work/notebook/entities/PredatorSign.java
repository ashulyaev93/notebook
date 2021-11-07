package com.work.notebook.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "PREDATOR_SIGN", schema = "ZOO")
public class PredatorSign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private int id;
    @Column(name = "hunter", length = 64, updatable = false)
    private String hunter;
    @OneToMany
    @JoinColumn(name = "hunter")
    private Set<Animal> animals;
}
