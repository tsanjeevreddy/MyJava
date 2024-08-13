package com.dts.core.syntax;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args)  {
        HashSet<String> hs = new HashSet<>();
        hs.add("Sanjeev");
        hs.add("test");
        hs.add("Apple");
        hs.add("Apple");
        hs.add("null");
        hs.add("null");
        System.out.println("Items Present in HashSet " + hs);
        System.out.println("Size of HashSet " + hs.size());
        for (String key : hs) {
            System.out.println("HashSet Value " + key);
        }
        System.out.println("Removing test from HashSet " + hs.remove("test"));
        System.out.println("Items Present in HashSet removed test " + hs);
        hs.add("Reddy");
        System.out.println("Items Present in HashSet added Reddy " + hs);
        System.out.println("=======================");
        // print all with for each
        hs.forEach(name -> System.out.println(name));
        System.out.println("=======================");
        // print all which starts with A
        hs.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));
    }
}
