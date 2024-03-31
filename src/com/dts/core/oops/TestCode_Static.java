package com.dts.core.oops;

public class TestCode_Static {
    public static void main(String[] as) {
        System.out.println(fun(1, 1));
    }

    static int fun(int a, int b) {
        return a + b;
    }
    // we can not create like this below method

//    static void fun(int c, int f) {
//    }
}
