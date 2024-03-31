package com.dts.core.syntax;

public class Client1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();

        String tempName = s1.name;
        s1.name = s2.name;
        s2.name = tempName;

        s1.display();
    }

    private static void swap(Student s1, Student s2) {
        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }
}
