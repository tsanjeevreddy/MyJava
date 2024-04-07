package com.dts.core.program.string;

import com.dts.core.program.utill.Console;
import com.dts.core.program.utill.StringHelper;

public class FirstRepeatingCharacter {
    public static void main(String[] as) {
        findFirstRepeatingCharacter(Console.takeStringFromConsole());
    }

    private static void findFirstRepeatingCharacter(String value) {
        char firstRepeatingChar = StringHelper.extractStringFirstRepeatChar(value);
        if(firstRepeatingChar == '\0') {
            System.out.println("No First repeating character in the given String: " +  value);
        } else {
            System.out.println("Found First repeating character: " + firstRepeatingChar);
        }
    } 
}
