package com.dts.core.program.threads;

public class ThreadSimple extends Thread {

    private String name;

    ThreadSimple(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("In side Run of Thread.. Started.. ThreadName: " + name);
    }

    public static void main(String[] as) {
        Thread t1 = new ThreadSimple("My First Thread1...");
        t1.start();
        // try {
        // t1.sleep(1000);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        System.out.println(t1.getName());
    }

}
