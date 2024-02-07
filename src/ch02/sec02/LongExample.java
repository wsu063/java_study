package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10; //정수타입 -> int타입 허용범위 안에 있으면 L을 안붙여도 된다.
        long var2 = 20L; // 롱타입
        //long var3 = 1000000000000000000; // int타입으로 인식 -> int타입 허용범위를 벗어남
        long var4 = 1000000000000000000L; // long타입으로 인식

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);

    }
}
