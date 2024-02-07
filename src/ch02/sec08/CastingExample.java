package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        //강제타입 변환(int -> byte)
        int var1 = 103029770;
        byte var2 = (byte)var1;
        System.out.println("var2 = " + var2);

        //강제타입 변환(long -> int)
        long var3 = 300;
        int var4 = (int) var3;
        System.out.println("var4 = " + var4);

        //강제타입 변환(int -> char)
        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(("var6 = " + var6));

        //강제타입 변환(실수 -> 정수)
        double var7 = 3.14;
        int var8 = (int)var7;
        System.out.println("var8 = " + var8);
    }
}
