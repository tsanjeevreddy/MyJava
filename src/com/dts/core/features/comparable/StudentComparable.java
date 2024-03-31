package com.dts.core.features.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparable {
    public static void main(String[] args) {
        System.out.println("Hello world! Student Comparable");

        ArrayList<Movie> ar = new ArrayList<>();
        ar.add(new Movie(1.1,"balaya",2020));
        ar.add(new Movie(5,"kgf2",2022));
        ar.add(new Movie(4.5,"kgf1",2019));
        ar.add(new Movie(3,"krishna",1867));
        System.out.printf("Actual Movie Object:---------------Start" + System.lineSeparator());
        for (Movie m:ar) {
            System.out.printf(m + System.lineSeparator());
        }
        System.out.printf("Actual Movie Object:---------------End" + System.lineSeparator());

        System.out.printf(System.lineSeparator());
        System.out.printf(System.lineSeparator());
        Collections.sort(ar);

        System.out.printf("Sorted by Year:---------------Start" + System.lineSeparator());
        for (Movie m:ar) {
            System.out.printf(m + System.lineSeparator());
        }
        System.out.printf("Sorted by Year:---------------End" + System.lineSeparator());

//        System.out.printf(System.lineSeparator());
//        System.out.printf(System.lineSeparator());
//        Collections.sort(ar, new StudentSortByName());
//
//        System.out.printf("Array Compare by Name:---------------Start" + System.lineSeparator());
//        for (Student st:ar) {
//            System.out.printf(st + System.lineSeparator());
//        }
//        System.out.printf("Array Compare by Name:---------------End" + System.lineSeparator());
    }
}
