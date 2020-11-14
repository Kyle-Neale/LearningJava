package com.company;

public class Main {

    public static void main(String[] args) {
       // int myValue = 10_000;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Max integer: " + maxInt);
        System.out.println("Min integer: " + minInt);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Max byte: " + maxByte);
        System.out.println("Min byte: " + minByte);

        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Max short: " + maxShort);
        System.out.println("Min short: " + minShort);

       // long myLongValue = 100L;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Max long: " + maxLong);
        System.out.println("Min long: " + minLong);

        byte newByteValue = (byte) (minByte / 2);
        short newShortValue = (short) (maxShort / 2);
        System.out.println(newByteValue);
        System.out.println(newShortValue);
    }
}
