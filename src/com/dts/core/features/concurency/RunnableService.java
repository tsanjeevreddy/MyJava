package com.dts.core.features.concurency;

public class RunnableService implements Runnable {

    @Override
    public void run() {
        System.out.println("RunnableService Initiated !! : " + Thread.currentThread().getName());
    }
}
