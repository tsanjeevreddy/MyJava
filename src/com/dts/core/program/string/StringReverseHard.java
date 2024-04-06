package com.dts.core.program.string;

import com.dts.core.program.utill.Console;

public class StringReverseHard {

    public static void main(String[] args) {
        reverseStringWithOutInbuilt(Console.takeStringFromConsole());
    }

    private static void reverseStringWithOutInbuilt(String value) {
        System.out.println("==========================");
        System.out.println("Original String: " + value);

        char[] charAr = value.toCharArray();
        int start = 0;
        int end = value.length() - 1;

        while(start < end) {
        char temp = charAr[start];
        charAr[start] = charAr[end];
        charAr[end] = temp;

        start++;
        end--;
        }

        System.out.println("Reverse String: " + new String(charAr));
    }

}
