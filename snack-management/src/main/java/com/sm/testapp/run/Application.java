package com.sm.testapp.run;

import com.sm.testapp.aggregate.Product;
import com.sm.testapp.service.ProductService;

import java.util.Scanner;

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
                case 2: ps.searchProduct(chosenName()); break;
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

    private static Object chosenName() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.print("제품 이름을 입력하세요: ");
        return sc.nextLine();
    }

}
