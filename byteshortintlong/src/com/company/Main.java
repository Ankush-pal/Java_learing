package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(" Integer Minimum Value = " + myMinIntValue);
        System.out.println(" Integer Maximum Value = " + myMaxIntValue);
        System.out.println(" Busted max value " + (myMaxIntValue + 1));
        System.out.println(" Busted min value " + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = "  +(myMinByteValue));
        System.out.println("Byte max value = "  +(myMaxByteValue));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = "  +(myMinShortValue));
        System.out.println("Short max value = "  +(myMaxShortValue));

        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = "  +(myMinLongValue));
        System.out.println("Long max value = "  +(myMaxLongValue));

        long myvalue = 232323232;
        System.out.println(myvalue);


    }

}
