package com.work.notebook.controllers;

import com.work.notebook.entities.Product;
import com.work.notebook.services.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/products")
public class ProductsController {

    private ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> productList = productsService.listProducts();

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @RequestMapping(value = "/{product_id}")
    public ResponseEntity<List<Product>> getProductById(@PathVariable("product_id") int productId){
        Product product = productsService.getProductById(productId);

        return new ResponseEntity(product,HttpStatus.OK);
    }
}
