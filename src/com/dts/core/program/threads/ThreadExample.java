package com.dts.core.program.threads;

public class ThreadExample extends Thread {
    public void run() {
        int a= 10;  
        int b=12;  
        int result = a+b;  
        System.out.println("Thread started running..");  
        System.out.println("Sum of two numbers is: "+ result); 
    }

    public static void main(String[] as) {
        ThreadExample example1 = new ThreadExample();
        example1.start();
    }
}
