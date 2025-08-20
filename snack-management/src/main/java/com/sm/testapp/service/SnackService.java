package com.sm.testapp.service;

import com.sm.testapp.repository.SnackRepository;

public class SnackService {
    private final SnackRepository snackRepository;

    public SnackService() {
        snackRepository = new SnackRepository();
    }

}
