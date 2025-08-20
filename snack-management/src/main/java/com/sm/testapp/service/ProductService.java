package com.sm.testapp.service;

import com.sm.testapp.aggregate.ProduceStatus;
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

    public void searchProduct(String proName) {
        Product searchPro = productRepository.searchProduct(proName);
        if(searchPro != null){
            System.out.println("제품 조회 성공: " + searchPro);
        }
        else{
            System.out.println(proName + " 제품이 존재하지 않습니다.");
        }
    }

    public void registProduct(Product registPro) {
        int lastNum = productRepository.findLastProductNum();
        registPro.setProNo(lastNum + 1);

        registPro.setProduceStatus(ProduceStatus.INPRODUCTION);

        int result = productRepository.registProduct(registPro);
        if(result == 1){
            System.out.println(registPro.getProNo() + "번 " + registPro.getProName() + "제품이 등록되었습니다.");
        }
        else{
            System.out.println("제품 등록 실패");
        }
    }
}
