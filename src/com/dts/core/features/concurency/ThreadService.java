package com.dts.core.features.concurency;

public class ThreadService extends Thread {
    public void run() {
        System.out.println("ThreadService Initiated !!" + Thread.currentThread().getName());
    }
}
