package com.dts.core.syntax;

import java.util.List;

public class TypeErasure {
    public static void main(String[] as) {
        List<String> l1 = List.of("Hello", "hi", "how are you");
        List<Integer> l2 = List.of(1, 2, 35);
        List l3 = List.of("Hello", 1, "he");

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("====================");
        System.out.println(l1.getClass());
        System.out.println(l2.getClass());
        System.out.println(l3.getClass());

    }
}
