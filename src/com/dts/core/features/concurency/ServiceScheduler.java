package com.dts.core.features.concurency;

public class ServiceScheduler {
    public static void main(String[] as) {
        RunnableService runnableService = new RunnableService();
        Thread t = new Thread(runnableService);
        t.start();
        ThreadService threadService = new ThreadService();
        Thread t1 = new Thread(threadService);
        t1.start();
    }
}
