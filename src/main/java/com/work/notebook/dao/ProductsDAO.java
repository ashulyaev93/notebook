package com.work.notebook.dao;

import com.work.notebook.entities.Product;

import java.util.List;

public interface ProductsDAO {

    public List<Product> listProducts();
    public Product getProductById(int productId);
}
