package com.dts.core.program.utill;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    public static ArrayList<Integer> takeArrayValuesFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        Integer size = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < size; i++) {
            arrayList.add(sc.nextInt());
        }
        sc.close();
        return arrayList;
    }

    public static String takeStringFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Program: ");
        String retString = sc.nextLine();
        sc.close();
        return retString;
    }

}
