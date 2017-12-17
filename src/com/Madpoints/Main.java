package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        // width int = 32 (4 bytes)
        int integer = 5 / 3;
        // width float = 32 (4 bytes)
        float floatNumber = 5f / 3f;
        // width double = 64 (8 bytes)
        double doubleNumber = 5d / 3d;

        System.out.println("myInt = " + integer);
        System.out.println("myFloat = " + floatNumber);
        System.out.println("myDouble = " + doubleNumber);

        // Pounds to kilograms
        double pounds = 32d;
        double kilograms = pounds * 0.45_359_237d;

        System.out.println(kilograms);
    }
}
