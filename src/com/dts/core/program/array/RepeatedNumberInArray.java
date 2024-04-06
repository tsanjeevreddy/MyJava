package com.dts.core.program.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.dts.core.program.utill.Console;

public class RepeatedNumberInArray {
    public static void main(String[] as) {
        ArrayList<Integer> ar = Console.takeArrayValuesFromConsole();
        findRepeatedNumberInArray(ar);
    }

    private static void findRepeatedNumberInArray(ArrayList<Integer> ar) {
        Set<Integer> repeatedElements = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();
        for(int i : ar) {
            if(!uniqueElements.add(i)) {
                repeatedElements.add(i);
            }
        }

        if(repeatedElements.isEmpty()) {
            System.out.println("No Repeated Elements found in Array");
        } else {
            System.out.println("Found Repeated Elements in Array" + repeatedElements);
        }
    }

}