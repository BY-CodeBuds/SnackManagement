package com.sm.testapp.run;

import com.sm.testapp.aggregate.Category;
import com.sm.testapp.aggregate.Product;
import com.sm.testapp.service.ProductService;

import java.util.*;

public class Application {
    private static final ProductService ps = new ProductService();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("===== 제과 제조 관리 프로그램 =====");
            System.out.println("1. 모든 제품 정보 보기");
            System.out.println("2. 제품 검색");
            System.out.println("3. 제품 추가");
            System.out.println("4. 제품 수정");
            System.out.println("5. 제품 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");
            int input = sc.nextInt();

            switch(input){
                case 1: ps.findAllProduct(); break;
                case 2: ps.searchProduct(chosenName());break;
                case 3: ps.registProduct(add()); break;
                case 4:
                    Product selectProduct = ps.findProductForMod(chosenName());

                    ps.modifyProduct(reform(selectProduct));
                    break;
                case 5:
                    ps.removeProduct(chosenProNum());
                    break;
                case 9:
                    System.out.println("---프로그램을 종료합니다---");
                    return;
                default:
                    System.out.println("정확한 번호를 입력해주세요.");
            }
        }

    }

    private static Product add() {
        Product product = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("들어가는 재료의 갯수를 입력하세요: ");
        int ingreNum = sc.nextInt();
        String[] arr = new String[ingreNum];

        sc.nextLine(); //버퍼 제거

        for (int i = 0; i < ingreNum; i++) {
            System.out.print((i + 1)  + "번째 재료를 입력하세요: ");
            arr[i] = sc.nextLine();
        }
        System.out.print("제조날짜를 입력하세요: ");
        String made = sc.nextLine();

        System.out.print("유통기한을 입력하세요: ");
        String expire = sc.nextLine();

        System.out.println("카테고리를 입력하세요: ");
        String cate = sc.nextLine();
        Category cg = null;

        switch(cate){
            case "SNACK": cg = Category.SNACK; break;
            case "BREAD": cg = Category.BREAD; break;
            case "CHOCOLATE": cg = Category.CHOCOLATE; break;
        }

        product = new Product(name, arr, made, expire, cg);

        return product;
    }

    private static String chosenName() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();  // 버퍼 제거
        System.out.print("제품 이름을 입력하세요: ");
        return sc.nextLine();
    }

}
