package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int temp = x;
        System.out.println("x: "+ x+ ",y: " + y);
        //두 변수의 값을 교환하는 방법
        x = y;
        y = temp;
        System.out.println("값 교환 후 x: "+ x+ ",y: " + y);


    }
}
