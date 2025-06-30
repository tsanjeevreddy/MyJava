package com.dts.core.program.number;

import com.dts.core.program.utill.Console;

public class PrimeNumber {
    public static void main(String[] as) {
        findFactor(Console.takeIntFromConsole());
    }

    public static void findFactor(Integer number) {
        boolean isPrime = true;
        if(number <= 1) {
            isPrime = false;

        }

        for(int i=2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println("Given Number is Prime: " + isPrime);
        } else {
            System.out.println("Given Number is not a Prime: " + isPrime);
        }
    }
}
