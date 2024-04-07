package com.dts.core.program.threads;

public class ThreadRunnableSimple implements Runnable {

    @Override
    public void run() {
        System.out.println("In side Run of Runnable.. Start..");
    }

    public static void main(String[] as) {
        Runnable r1 = new ThreadRunnableSimple();
        Thread t1 = new Thread(r1, "My New Runnable Thread..");
        t1.start();
        System.out.println(t1.getName());
    }
    
}
