package com.dts.core.features.compare;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCompare {
    public static void main(String[] args) {
        System.out.println("Hello world! Student Compare");

        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(1,"Sanjeeva","6435 Tranquilo"));
        ar.add(new Student(3,"Jaishu","6437 Tranquilo"));
        ar.add(new Student(4,"Dts","6438 Tranquilo"));
        ar.add(new Student(2,"Tulasi","6436 Tranquilo"));
        System.out.printf("Actual Array:---------------Start" + System.lineSeparator());
        for (Student st:ar) {
            System.out.printf(st + System.lineSeparator());
        }
        System.out.printf("Actual Array:---------------End" + System.lineSeparator());

        System.out.printf(System.lineSeparator());
        System.out.printf(System.lineSeparator());
        Collections.sort(ar, new StudentSortByRoll());

        System.out.printf("Array Compare by number:---------------Start" + System.lineSeparator());
        for (Student st:ar) {
            System.out.printf(st + System.lineSeparator());
        }
        System.out.printf("Array Compare by number:---------------End" + System.lineSeparator());

        System.out.printf(System.lineSeparator());
        System.out.printf(System.lineSeparator());
        Collections.sort(ar, new StudentSortByName());

        System.out.printf("Array Compare by Name:---------------Start" + System.lineSeparator());
        for (Student st:ar) {
            System.out.printf(st + System.lineSeparator());
        }
        System.out.printf("Array Compare by Name:---------------End" + System.lineSeparator());
    }
}