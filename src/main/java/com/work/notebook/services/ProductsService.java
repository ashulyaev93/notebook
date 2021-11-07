package com.work.notebook.services;

import com.work.notebook.repositories.ProductsRepository;
import com.work.notebook.entities.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public interface ProductsService {

//    public static final Logger LOG = LoggerFactory.getLogger(ProductsService.class);
//
//    private ProductsRepository productsRepository;
//    private EntityManagerFactory entityManagerFactory;
//
//    @Autowired
//    public ProductsService(ProductsRepository productsRepository,
//                           EntityManagerFactory entityManagerFactory){
//        this.productsRepository = productsRepository;
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public List<Product> listProducts() {
//        return this.productsRepository.listProducts();
//    }
//
//    public Product getProductById(Long productId) {
//        return this.productsRepository.getProductById(productId);
//    }


    List<Product> listProducts();
    Product getProductById(Long productId);
}
