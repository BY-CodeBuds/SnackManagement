package com.sm.testapp.repository;

import com.sm.testapp.aggregate.Category;
import com.sm.testapp.aggregate.ProduceStatus;
import com.sm.testapp.aggregate.Product;

import java.io.File;
import java.util.ArrayList;

public class ProductRepository {
    private final ArrayList<Product> productList = new ArrayList<>();
    private final File file = new File("src/main/java/com/sm/testapp/db/productDB.dat");

    public ProductRepository() {
        if (!file.exists()) {
            ArrayList<Product> defaultProductList = new ArrayList<>();
            defaultProductList.add(new Product(1, "칸쵸", new String[]{"카카오", "밀가루"},
                    "2025-08-10","2025-11-10", Category.SNACK, ProduceStatus.INPRODUCTION));
        }
    }
}
