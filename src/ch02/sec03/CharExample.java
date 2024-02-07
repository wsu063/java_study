package ch02.sec03;

public class CharExample   {
    public static void main(String[] args) {
        char c1 = 'A'; //문자 1개만 쓸 수 있다. 반드시 작은 따옴표로 표현
        char c2 = 65; // 유니코드 값
        char c3 = '가';
        char c4 = 44032; // 유니코드 값

        // char타입에서 빈문자(공백)를 표현하고 싶을때 => 공백도 유니코드 값을 가지고 있음.
        //char c5 = ''; //비어있는 캐릭터 값.
        char c6 = ' '; // 공백의 유니코드는 35

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c6);
    }
}
