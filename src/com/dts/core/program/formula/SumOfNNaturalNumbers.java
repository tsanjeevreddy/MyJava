package com.dts.core.program.formula;

import com.dts.core.program.utill.Console;

public class SumOfNNaturalNumbers {

    public static void main(String[] as) {
        Integer value = Console.takeIntFromConsole();
        System.out.println("Sum of N Natural Numbers: " + value * (value +1) / 2);
    }

}
