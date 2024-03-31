package com.dts.core.features.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] as) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0; i<100; i++) {
            executorService.submit(() -> {
               System.out.println("ExecutorService Task Running..");
            });
        }
        executorService.shutdown();
    }
}
