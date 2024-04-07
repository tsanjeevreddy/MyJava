package com.dts.core.program.utill;

import java.util.HashSet;

public class StringHelper {
    public static char extractStringFirstRepeatChar(String value) {
        // If the character is already present in the set, it's the first repeating character
        HashSet<Character> charSet = new HashSet<>();
        for(char ch : value.toCharArray()) {
            // If the character is already present in the set, it's the first repeating character
            if(!charSet.add(ch)) {
                return ch;
            }
        }
        return '\0';
    }

    public static char extractStringSecondRepeatChar(String value) {
        // If the character is already present in the set, it's the first repeating character
        HashSet<Character> charEcounterSet = new HashSet<>();
        HashSet<Character> charRepeatedSet = new HashSet<>();
        for(char ch : value.toCharArray()) {
            // If the character is already present in the set, it's the first repeating character
            if(!charEcounterSet.add(ch)) {
                charRepeatedSet.add(ch);
            }

            if(charRepeatedSet.size() == 2) {
                return ch;
            }
        }
        return '\0';
    }
}
