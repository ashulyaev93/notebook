package com.work.notebook.controllers;

import com.work.notebook.entities.Product;
import com.work.notebook.services.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/products")
public class ProductsController {

    private ProductsService productsService;

    @Autowired
//    @Qualifier(value = "productsService")
    public void setProductsService(ProductsService productsService) {
        this.productsService = productsService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String listProducts(Model model){
        model.addAttribute("product", new Product());
        model.addAttribute("listProducts", this.productsService.listProducts());

        return "products";
    }

    @RequestMapping(value = "/productData/{product_id}")
    public String productData(@PathVariable("product_id") int productId, Model model){
        model.addAttribute("product", this.productsService.getProductById(productId));

        return "productData";
    }

}
