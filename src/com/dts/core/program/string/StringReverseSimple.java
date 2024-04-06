package com.dts.core.program.string;

import com.dts.core.program.utill.Console;

public class StringReverseSimple {

    public static void main(String[] args) {
        reverseStringWithReverse(Console.takeStringFromConsole());
    }

    private static void reverseStringWithReverse(String value) {
        System.out.println("Original String: " + value);
        System.out.println("Reverse String: " + new StringBuilder(value).reverse().toString());
    }
}
