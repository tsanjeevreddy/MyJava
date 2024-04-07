package com.dts.core.program.string;

import com.dts.core.program.utill.TimeUsage;

public class StringBuilderExample {
    public static void main(String[] args) {
        exploreStringUsage();
        exploreStringBuilderUsage();
    }

    private static void exploreStringUsage() {
        // String concatenation creates a new string object each time
        String result = "";
        long startTime, endTime;
        startTime = TimeUsage.getTimeNow();
        for (int i = 0; i < 10000; i++) {
            result += " " + i; 
        }
        endTime = TimeUsage.getTimeNow();
        //System.out.println(result);
        System.out.println(" Time Took using String concat: " + TimeUsage.getTimeDiff(startTime, endTime) + " ms");
    }

    

    private static void exploreStringBuilderUsage() {
        // Efficiently appends to the StringBuilder without creating new objects
        StringBuilder sb = new StringBuilder();
        long startTime, endTime;
        startTime = TimeUsage.getTimeNow();
        for (int i = 0; i < 10000; i++) {
            sb.append(" ").append(i); 
        }
        String result2 = sb.toString();
        endTime = TimeUsage.getTimeNow();
        //System.out.println(result2);
        System.out.println(" Time Took using StringBuilder concat: " + TimeUsage.getTimeDiff(startTime, endTime) + " ms");
    }

}
