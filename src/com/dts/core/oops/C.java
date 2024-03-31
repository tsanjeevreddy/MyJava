package com.dts.core.oops;

public class C extends P {
    protected int d2 = 20;
    protected int d = 200;

    protected void fun2(){
        System.out.println("C's fun2");
    }

    protected void fun(){
        System.out.println("C's fun");
    }

    // even thought we override as because of static it won't get modified.
    static protected void sfun(){
        System.out.println("C's sfun");
    }
}
