package com.sm.testapp.service;

import com.sm.testapp.repository.ProductRepository;

public class SnackService {
    private final ProductRepository snackRepository;

    public SnackService() {
        snackRepository = new ProductRepository();
    }

}
