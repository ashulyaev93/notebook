package com.work.notebook.dto;

import com.work.notebook.entities.Animal;
import com.work.notebook.entities.Product;
import lombok.Data;

@Data
public class FoodRatesDTO {
    private int id;
    private Animal animal;
    private Product product;
    private Long rate;
    private String unit;
}
