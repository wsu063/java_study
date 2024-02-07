package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 정밀도(double > float)
        float var1 = 0.1234567890123456789F;
        double var2 = 0.1234567890123456789;

        System.out.println("var1: " + var1); // 실수형은 기본 리터럴을 double타입으로 인식하므로 F를 붙여준다.
        System.out.println("var2: " + var2);

        //가수와 지수 나눠서 작성하기
        double var3 = 3e6; // 3.0 * 10^6
        System.out.println("var3: " + var3);

        float var4 = 3e6F;
        System.out.println("var4: " + var4);

        double var5 = 2e-3; /// 2.0 * 10^-3
        System.out.println("var5: " + var5);
    }
}
