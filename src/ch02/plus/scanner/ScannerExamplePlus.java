package ch02.plus.scanner;

import java.util.Scanner;

public class ScannerExamplePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // nextLine(): 한칸 띄워서 써도 엔터칠때까지는 잘 인식한다.
//        System.out.print("nextLine()입력: ");
//        String inputNextLine = scanner.nextLine();
//        System.out.println(inputNextLine);
//        // next(): 한칸 띄워쓰면 입력이 종료된다.
//        System.out.print("next()입력: ");
//        String inputNext = scanner.next();
//        System.out.println(inputNext);

        System.out.print("int형 입력: ");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);

        System.out.print("double형 입력: ");
        double inputDouble = scanner.nextDouble();
        System.out.println(inputDouble);

        System.out.println("int + double = " + (inputInt + inputDouble));

        System.out.print("boolean형 입력: ");
        Boolean inputBoolean = scanner.nextBoolean();
        System.out.println(inputBoolean);

    }
}
