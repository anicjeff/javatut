package com.njeffery;

public class Main {
    //define vars and constants
    static String randomString = "String to print";
    static final double PINUM = 3.14;
//main method, where the program starts
    public static void main(String[] args) {
        System.out.println(randomString);
        System.out.println(PINUM);

        int intOne = 22;
        int intTwo = intOne + 1;

        System.out.println(intTwo);


//define vars
        byte bigByte = 127;
        short bigShort = 32767;
        int bitInt = 2100000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.143256879856656;
        boolean trueOrFalse = true;
        char randomChar = 65;
        char anotherChar = 'A';
        char escapedChars = '\n';

        String ranString = "im random";
        String notherString = "more shit";

        System.out.println(ranString + " " + notherString);
//converts variables to strings
        String byteString = Byte.toString(bigByte);
        String intString = Integer.toString(bitInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);

        System.out.println(byteString + intString + longString + floatString + doubleString + booleanString);
//double cast to interger, drops the decimal
        double aDoubleValue = 3.14;
        int  doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);


//prints max value of specified primative var type
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
//converts a string to an interger to use for maths and shit parseShort parseLong parseFloat
        int stringToInt = Integer.parseInt(intString);
        System.out.println(stringToInt);



    }
}