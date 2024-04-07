package com.dts.core.program.threads;

public class PrintNumberTask implements Runnable {
    private int from;
    private int to;
    PrintNumberTask(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for(int i=from; i<= to; i++) {
            System.out.println("Number:" +  i);
        }
    }
    
}
