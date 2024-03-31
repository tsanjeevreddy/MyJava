package com.dts.core.syntax;

import java.util.Scanner;

public class ArrStaticEx {
    public static void main(String[] as) {

        // int type array

        int[] ars = {10,3,5};
        ars[0] = 10000;
        for(int i=0; i < ars.length; i++) {
            System.out.println("Array Index: " + i + " Array Value: " + ars[i]);
        }

        Scanner sc= new Scanner(System.in);
        int[] ar = new int[sc.nextInt()];
        for(int i=0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        ar[1] = 99999;
        for (int i=0; i < ar.length; i++) {
            System.out.println("Array Index: " + i + " Array Value: " + ar[i]);
        }

        // char type array
        char[] ch = new char[2];
        for (int i=0; i<ch.length; i++) {
            ch[i] = 'c';
            System.out.println("Char Array Index: " + i + " Char Array Value: " + ch[i]);
        }


        // string type array
        String[] st = new String[2];
        for (int i=0; i<st.length; i++) {
            st[i] = "Sanjeev";
            System.out.println("String Array Index: " + i + " String Array Value: " + st[i]);
        }

        // float type array
        float[] fl = new float[2];
        for (int i=0; i<fl.length; i++) {
            fl[i] = 3.0f;
            System.out.println("Float Array Index: " + i + " Float Array Value: " + fl[i]);
        }
    }
}
