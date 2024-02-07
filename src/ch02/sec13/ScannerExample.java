package ch02.sec13;

import java.util.Scanner; // 이게 있어야 Scanner 사용 가능

public class ScannerExample {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성
        // 자바에서 객체 생성시에는 new라는 키워드를 사용해 객체 생성
        // 참조타입 변수명 = new객체

        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");
        // 2. scanner에서 값 입력받기
        String strX = scanner.nextLine();

        System.out.print("y값 입력: ");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("x + y = " + result);

        //계속 입력을 받을 수 있게 만들고 q를 입력했을때 프로그램이 끝나도록 만들기
        while(true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();

            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);

        }
        System.out.println("프로그램 종료");
    }
}
