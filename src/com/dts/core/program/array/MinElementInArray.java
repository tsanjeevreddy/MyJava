package com.dts.core.program.array;

import java.util.ArrayList;

import com.dts.core.program.utill.Console;

public class MinElementInArray {
    public static void main(String[] as) {
        ArrayList<Integer> ar = Console.takeArrayValuesFromConsole();
        checkMinElementInArray(ar);
    }

    public static void checkMinElementInArray(ArrayList<Integer> ar) {
        int minElement = ar.get(0);
        int minElementIndex = 0;
        for (int i = 1; i < ar.size(); i++) {
            if (ar.get(i) < minElement) {
                minElement = ar.get(i);
                minElementIndex = i;
            }
        }
        System.out.println("Min Element of Array: " + minElement + " At index: " + minElementIndex);
    }
}
