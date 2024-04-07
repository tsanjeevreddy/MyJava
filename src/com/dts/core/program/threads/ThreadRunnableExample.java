package com.dts.core.program.threads;

public class ThreadRunnableExample implements Runnable {
    
    String name;
    Thread thread;
    ThreadRunnableExample(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("A new Thread: " + thread + " is created \n");
        thread.start();
    }

    @Override
    public void run() {
        try {
            for(int j=5 ; j > 0; j--) {
                System.out.println(name + ":" + j);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ine) {
            System.out.println(name + ":" + "InterruptedException");
        }
        System.out.println("Thread Execution Completed..");
    }

    public static void main(String[] as) {
        new ThreadRunnableExample("1st Thread");
        new ThreadRunnableExample("2nd Thread");
        new ThreadRunnableExample("3rd Thread");
    }
    
}
