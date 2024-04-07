package com.dts.core.program.string;

public class StringImmutabilityExample {
    public static void main(String[] args) {
        String str1 = "Sanjeev";
        String str2 = str1; // Reference to the same string object, even pater modification this will be a copy 

        System.out.println("Original String: " + str1); // Output: Original String: Sanjeev

        // Modify the original string
        str1 += " Java Loves";

        // Output the modified and original strings
        System.out.println("Modified String: " + str1); // Output: Modified String: Sanjeev Java Loves
        System.out.println("Original String after modification: " + str2); // Output: Original String after modification: Sanjeev
    }
}
