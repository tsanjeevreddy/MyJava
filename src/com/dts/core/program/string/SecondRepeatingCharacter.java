package com.dts.core.program.string;

import com.dts.core.program.utill.Console;
import com.dts.core.program.utill.StringHelper;

public class SecondRepeatingCharacter {
    public static void main(String[] as) {
        secondFirstRepeatingCharacter(Console.takeStringFromConsole());
    }

    private static void secondFirstRepeatingCharacter(String value) {
        char secondRepeatingChar = StringHelper.extractStringSecondRepeatChar(value);
        if(secondRepeatingChar == '\0') {
            System.out.println("No Second repeating character in the given String: " +  value);
        } else {
            System.out.println("Found Second repeating character: " + secondRepeatingChar);
        }
    } 
}
