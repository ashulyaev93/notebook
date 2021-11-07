package com.work.notebook.services.impl;

import com.work.notebook.dao.AnimalsDAO;
import com.work.notebook.dao.ProductsDAO;
import com.work.notebook.entities.Product;
import com.work.notebook.services.ProductsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    private ProductsDAO productsDAO;

    public void setProductsDAO(ProductsDAO productsDAO) {
        this.productsDAO = productsDAO;
    }

    @Override
    @Transactional
    public List<Product> listProducts() {
        return this.productsDAO.listProducts();
    }

    @Override
    @Transactional
    public Product getProductById(int productId) {
        return this.productsDAO.getProductById(productId);
    }
}
