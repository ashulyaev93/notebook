package com.work.notebook.facade;

import com.work.notebook.dto.ProductsDTO;
import com.work.notebook.entities.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductsFacade {

    public ProductsDTO productsToProductsDTO(Product products){
        ProductsDTO productsDTO = new ProductsDTO();
        productsDTO.setProductId(products.getProductId());
        productsDTO.setName(products.getName());
        productsDTO.setQuantity(products.getQuantity());
        productsDTO.setUnit(products.getUnit());
        productsDTO.setTypeProduct(products.getTypeProduct());

        return productsDTO;
    }
}
