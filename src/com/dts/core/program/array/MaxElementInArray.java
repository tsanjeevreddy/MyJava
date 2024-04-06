package com.dts.core.program.array;

import java.util.ArrayList;
import com.dts.core.program.utill.Console;

public class MaxElementInArray {
    public static void main(String[] as) {
        ArrayList<Integer> ar = Console.takeArrayValuesFromConsole();
        checkMaxElementInArray(ar);
    }

    public static void checkMaxElementInArray(ArrayList<Integer> ar) {
        int maxElement = ar.get(0);
        int maxElementIndex = 0;
        for(int i=1; i< ar.size(); i++) {
            if(ar.get(i) > maxElement) {
                maxElement =  ar.get(i);
                maxElementIndex = i;
            }
        }
    System.out.println("Max Element of Array: " + maxElement + " At index: " + maxElementIndex);
    }

}
