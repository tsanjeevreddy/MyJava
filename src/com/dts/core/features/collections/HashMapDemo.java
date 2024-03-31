package com.dts.core.features.collections;

import java.util.HashMap;

public class HashMapDemo extends Thread {
    static HashMap<Integer, String> hm1 = new HashMap<>();
    public void run() {
        try {
            Thread.sleep(1000);
            hm1.put(103,"D");
        } catch (InterruptedException exception) {
            System.out.println("Child Thread going to add element");
        }
    }

    public static void main(String[] as) throws InterruptedException {
        hm1.put(100,"A");
        hm1.put(100,"B");
        hm1.put(102,"C");
        hm1.put(null, "F");
        System.out.println("...." + hm1);
        hm1.remove(null);
        System.out.println(".... ..." + hm1);
        HashMapDemo th = new HashMapDemo();
        th.start();

        for(Object o: hm1.entrySet()) {
            Object s = o;
            System.out.println(s);
            Thread.sleep(1000);
        }
        System.out.println(hm1);
    }

    // Learning
    // HashMap is non-Synchronized in nature i.e. HashMap is not Thread-safe
    // HashMap performance is relatively high because it is non-synchronized in nature and any number of threads can perform simultaneously
    // HashMap can add null values as key whereas Hashmap can add null key
    // chm.put(null,"C");
    // exception at adding runtime it will print as below.
    /*
    100=A
    101=B
    102=C
    null=F
    103=D
    {100=A, 101=B, 102=C, null=F, 103=D}
     */

}
