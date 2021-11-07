package com.work.notebook.dto;

import com.work.notebook.entities.TypeProduct;
import lombok.Data;

@Data
public class ProductsDTO {
    private int productId;
    private String name;
    private Long quantity;
    private String unit;
    private TypeProduct typeProduct;
}
