package com.sm.testapp.service;

import com.sm.testapp.repository.ProductRepository;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();
}
}
