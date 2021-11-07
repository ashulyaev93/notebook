package com.work.notebook.dto;

import com.work.notebook.entities.FoodRate;
import com.work.notebook.entities.KindAnimals;
import com.work.notebook.entities.PredatorSign;
import lombok.Data;

import java.util.Set;

@Data
public class AnimalsDTO {
    private int animalId;
    private String name;
    private KindAnimals kindAnimals;
    private PredatorSign predatorSign;
}
