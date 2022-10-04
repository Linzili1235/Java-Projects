public class Main {
    public static void main(String[] args) {
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        double myMinD = Double.MIN_VALUE;
        double myMaxD = Double.MAX_VALUE;

        System.out.println(myMinFloat);
        System.out.println(myMaxFloat);
        System.out.println(myMinD);
        System.out.println(myMaxD);

        int myInt = 5/3;
        float myFloat = 5F/3f; // floating number is assumed to be double in Java
        double myDouble = 5d/3d;
        float wuhu = (float) 5/3;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(wuhu);

        double pounds = 200d;
        double kilo = pounds * 0.45359237d;
        System.out.println(kilo);

        char myChar = 'D'; //only store single character
        char myUnicodeChar = '\u0044'; //unicode for D
        System.out.println(myUnicodeChar);
        System.out.println(myChar);

        boolean myTrue = true;
        boolean myFalse = false;

        boolean isCustomerOverTwentyOne = true;






    }
}