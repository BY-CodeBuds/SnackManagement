package com.sm.testapp.service;

import com.sm.testapp.repository.ProductRepository;

public class ProductService {
    private final SnackRepository snackRepository;

    public ProductService() {
        snackRepository = new SnackRepository();
    }
}
