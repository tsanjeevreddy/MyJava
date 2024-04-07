package com.dts.core.program.utill;

public class TimeUsage {

    public static long getTimeNow() {
        return System.nanoTime();
    }

    public static long getTimeDiff(long startTime, long endTime) {
        return endTime - startTime;
    }
    
}
