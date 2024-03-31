package com.dts.core.features.concurency;

public class BulkThreads {
    public static void main(String[] as) {
        for (int i =0; i<100; i++) {
            RunnableService rs = new RunnableService();
            Thread thread = new Thread(rs);
            thread.start();
        }
    }
}
