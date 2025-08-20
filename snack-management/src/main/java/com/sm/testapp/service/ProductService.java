package com.sm.testapp.service;

import com.sm.testapp.aggregate.Product;
import com.sm.testapp.repository.ProductRepository;

import java.util.ArrayList;

public class ProductService {
    private final ProductRepository productRepository;

    public ProductService() {
        productRepository = new ProductRepository();
}

    public void findAllProduct() {
        ArrayList<Product> result = productRepository.findAllProduct();
        if(!result.isEmpty()){
            System.out.println("---- 제품 목록 -----");
            for (Product product : result) {
                System.out.println(product);
            }
        }
        else{
            System.out.println("존재하는 제품이 없습니다.");
        }
    }
}
