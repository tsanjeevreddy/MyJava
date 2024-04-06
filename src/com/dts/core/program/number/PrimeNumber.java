package com.dts.core.program.number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        Integer number = Integer.parseInt(sc.nextLine());
        sc.close();
        findFactor(number);
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
