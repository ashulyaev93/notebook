package com.work.notebook.services;

import com.work.notebook.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductsService {

    List<Product> listProducts();
    Product getProductById(int productId);
}
