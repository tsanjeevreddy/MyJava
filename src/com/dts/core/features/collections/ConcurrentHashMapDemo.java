package com.dts.core.features.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
    static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
    public void run() {
        try {
            Thread.sleep(1000);
            chm.put(103,"D");
        } catch (InterruptedException exception) {
            System.out.println("Child Thread going to add element");
        }
    }

    public static void main(String[] as) throws InterruptedException {
        chm.put(100,"A");
        chm.put(101,"B");
        chm.put(102,"C");
        //chm.put(null,"C");
        // Exception in thread "main" java.lang.NullPointerException
        ConcurrentHashMapDemo th = new ConcurrentHashMapDemo();
        th.start();

        for(Object o: chm.entrySet()) {
            Object s = o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(chm);
    }


    // Learning
    // ConcurrentHashMap is Thread-safe in nature.
    // ConcurrentHashMap performance is low because sometimes Threads are required to wait on ConcurrentHashMap impl
    // ConcurrentHashMap can not add null values as key whereas Hashmap can add null key
    // chm.put(null,"C");
    // Exception in thread "main" java.lang.NullPointerException

}
