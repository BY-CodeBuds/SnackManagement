package com.sm.testapp.service;

import com.sm.testapp.repository.SnackRepository;

public class ProductService {
    private final SnackRepository snackRepository;

    public ProductService() {
        snackRepository = new SnackRepository();
    }

}
