package com.vasanth.springWebApp.controller;

// Controller used only for receiving and sending request to the sever or client

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vasanth.springWebApp.service.productService;
import com.vasanth.springWebApp.model.product;

import java.util.List;

@RestController
public class productController {

    @Autowired
    productService service;

    @RequestMapping("/products")
    public List<product> getProduct(){
        return service.getProducts();
    }

}
