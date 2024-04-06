package com.dts.core.program.number;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] as) {
        Scanner sc = new Scanner(System.in);
        Integer number = Integer.parseInt(sc.nextLine());
        sc.close();
        findEvenOrOdd(number);
    }

    public static void findEvenOrOdd(Integer number) {
        boolean isEven = false;
        if(number %  2 == 0) {
            isEven = true;
        }

        if(isEven) {
            System.out.println("Given Number is Even: " + isEven);
        } else {
            System.out.println("Given Number is not a Even: " + isEven);
        }
    }
}
