package com.sm.testapp.repository;

import com.sm.testapp.aggregate.Category;
import com.sm.testapp.aggregate.ProduceStatus;
import com.sm.testapp.aggregate.Product;

import java.io.*;
import java.util.ArrayList;

public class ProductRepository {
    private final ArrayList<Product> productList = new ArrayList<>();
    private final File file = new File("src/main/java/com/sm/testapp/db/productDB.dat");

    public ProductRepository() {
        if (!file.exists()) {
            ArrayList<Product> defaultProductList = new ArrayList<>();
            defaultProductList.add(new Product(1, "칸쵸", new String[]{"카카오", "밀가루"},
                    "2025-08-10","2025-11-10", Category.SNACK, ProduceStatus.INPRODUCTION));
            defaultProductList.add(new Product(2, "크런키볼", new String[]{"카카오", "설탕"},
                    "2025-07-15","2025-10-04", Category.CHOCOLATE, ProduceStatus.INPRODUCTION));
            defaultProductList.add(new Product(3, "크림빵", new String[]{"계란", "밀가루", "버터"},
                    "2024-08-10","2025-01-03", Category.BREAD, ProduceStatus.DISCARDED));
            
            saveProducts(defaultProductList);
        }

        loadProducts();
    }

    /* 설명. ArrayList에 담긴 데이터를 파일로 내보냄 */
    private void saveProducts(ArrayList<Product> defaultProductList) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            for (Product product : defaultProductList) {
                oos.writeObject(product);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    /* 설명. 파일로부터 데이터를 읽어옴 */
    private void loadProducts() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                productList.add((Product) ois.readObject());
            }
        } catch (EOFException e) {
            System.out.println("제품 정보 읽어오기 완료");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


}
