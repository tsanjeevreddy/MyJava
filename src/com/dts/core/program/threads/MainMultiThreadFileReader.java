package com.dts.core.program.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMultiThreadFileReader {

    public static void main(String[] as) {
        String[] fileNames = { "/Users/{userName}/Desktop/test.txt",
                "/Users/{userName}/Desktop/1.txt", "/Users/{userName}/Desktop/2.txt",
                "/Users/{userName}/Desktop/3.txt", "/Users/{userName}/Desktop/4.txt" };

        // Create a fixed-size thread pool with a maximum of 5 threads with
        // ExecutorService
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new FileReaderTask(fileNames));
    }
}
