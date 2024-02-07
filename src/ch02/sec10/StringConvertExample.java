package ch02.sec10;

public class StringConvertExample {
    public static void main(String[] args) {
        String str = "10";
        int value1 = Integer.parseInt(str);
        double value2 = Double.parseDouble(str);
        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);


        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);

    }
}
