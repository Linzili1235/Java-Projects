public class Main {
    public static void main(String[] args) {

        //int myValue = 10000;
        int myMinInValue = Integer.MIN_VALUE;
        int myMaxInValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinInValue);
        System.out.println("Integer Maximum Value " + myMaxInValue);
        System.out.println("Busted MAX value= " + (myMaxInValue+1)); //overflow
        System.out.println("Busted MIN value= " + (myMinInValue-1)); //overflow
        //int myMaxTest = 2_147_483_647;

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value " + myMinByte);
        System.out.println("Byte Maximum Value " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("Short Minimum Value " + myMinShort);
        System.out.println("Short Maximum Value " + myMaxShort);

        long myLongValue = 100; //it could transform int 100 to long, so it doesn't matter no L BuT
        long bigLongLiteralValue = 2_147_483_648L; //if larger than max Int, then it could cause error if no L
        System.out.println(myLongValue);
        System.out.println(bigLongLiteralValue);
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("Long Minimum Value " + myMinLong);
        System.out.println("Long Maximum Value " + myMaxLong);
        //short bigShortLiteralValue = 32767; //you express it using int, but it's actually literal value expressed
        //which can fit into short

        //int myTotal = myMinInValue / 2;
        //wouldn't work bc computer treat para in () as int
        //byte myNewByteValue = (myMinByte / 2) ;
        //byte myNewByteValue = (byte) (myMinByte / 2);

        //challenge
        byte m = 123;
        short n = 321;
        int x = 23;
        //long MyT = 50000 + (long) (10*((byte)(m) + (short)(n) + (int)(x)));
        long MyT = 50000L + (10L * (m + n + x));
        System.out.println(MyT);
        //don't need to casting in this case, if it's short you need to use casting




    }
}