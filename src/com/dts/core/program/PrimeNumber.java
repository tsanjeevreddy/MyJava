package com.dts.core.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        if(n == 0 || n == 1) {
            System.out.println(" Given Number is not a Prime: " + n);
        }
        if (n == 2) {
            System.out.println(" Given Number is Prime: " + n);
        }
        for(int i=2 ; i< n/2; i++) {
           if(n % i == 0) {

           }
        }
    }

    private static void findFactors(Integer in) {
        List<Integer> list = new ArrayList<>();
        if(in % 2 == 0) {
            list.add(in);
        }
    }
}
