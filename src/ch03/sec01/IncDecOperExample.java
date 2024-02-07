package ch03.sec01;

public class IncDecOperExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
//        값 자체는 전위, 후위든 증가와 감소를 한다.
        x++;
        System.out.println("x= " + x);
        ++x;
        System.out.println("x= " + x);

        y--;
        System.out.println("y= " + y);
        --y;
        System.out.println("y= " + y);

        System.out.println("=======================================");

        z = x++; // 대입 먼저, 증가 나중에
        System.out.println("z = " + z);
        System.out.println("x = " + x); 
        z = ++x; // 증가 먼저, 대입 나중에
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        //현재 x는 14, y는 8
        z = ++x + y++; // 더해질때 x는 15, y는 8
        // 더해지고나서 x는 15, y는 9

        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("y= " + y);


    }
}
