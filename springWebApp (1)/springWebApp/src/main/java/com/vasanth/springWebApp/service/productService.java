package com.vasanth.springWebApp.service;

import com.vasanth.springWebApp.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {

    List<product> products = Arrays.asList(
            new product(101,"Iphone",50000),
            new product(102,"Ipad",40000),
            new product(103,"mobile",18000));

    public List<product> getProducts() {
        return products;
    }
}
