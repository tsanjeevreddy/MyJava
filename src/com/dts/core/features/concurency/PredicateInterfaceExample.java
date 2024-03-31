package com.dts.core.features.concurency;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
    public static void main(String[] as) {

        Predicate<Integer> predicateValue = i -> (i<5);

        System.out.println(predicateValue.test(10));
        System.out.println(predicateValue.and(i -> i >3).test(4));
        System.out.println(predicateValue.negate());
        System.out.println(predicateValue.equals(20));
    }
}
