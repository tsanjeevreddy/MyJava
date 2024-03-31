package com.dts.core.oops;

public class TestCode {
    public static void main(String[] as) {
        Person p1= new Person();
        p1.age = 10;
        p1.name = "Sanjeev-1";

        Person p2= new Person();
        p2.age = 20;
        p2.name = "Sanjeev-2";

        swap(p1, p2);
        System.out.println(p1.age + "-" + p1.name);
        System.out.println(p2.age + "-" + p2.name);
    }

    static void swap(Person p1, Person p2) {
        Person temp = p1;
        p1 = p2;
        p2= temp;
    }
}
