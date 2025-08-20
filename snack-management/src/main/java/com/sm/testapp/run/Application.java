package com.sm.testapp.run;

import com.sm.testapp.service.SnackService;

import java.util.Scanner;

public class Application {
    private static final SnackService ss = new SnackService();

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
            System.out.println("메뉴를 선택하세요: ");
            int input = sc.nextInt();

            switch(input){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("---프로그램을 종료합니다---");
                    return;
                default:
                    System.out.println("정확한 번호를 입력해주세요.");
            }
        }

    }
}
