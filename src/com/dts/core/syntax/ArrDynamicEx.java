package com.dts.core.syntax;

import java.util.ArrayList;

public class ArrDynamicEx {
    public static void main(String[] as) {
        ArrayList<Integer> ar = new ArrayList<>();

        System.out.println("Initial Size of Array: " + ar.size());
        ar.add(100);ar.add(200);ar.add(300);
        System.out.println("Array Data: " + ar);
        System.out.println("Later Size of Array: " + ar.size());

        System.out.println("Get 0th index Item From Array: " + ar.get(0));
        System.out.println("Remove 0th index Item From Array: " + ar.remove(0));
        System.out.println("Size After removal of 0th index: " + ar.size());
        System.out.println("Final Array Data: " + ar);

        ar.add(1,400);
        System.out.println("Added 4th index Data");
        System.out.println("Final Final Array Data: " + ar);
    }
}
