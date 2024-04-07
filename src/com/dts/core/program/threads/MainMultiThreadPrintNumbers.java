package com.dts.core.program.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMultiThreadPrintNumbers {

    public static void main(String[] as) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new PrintNumberTask(1, 10));
    }
}
