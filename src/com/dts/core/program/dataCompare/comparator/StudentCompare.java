package com.dts.core.program.dataCompare.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCompare {

    public static void main(String[] as) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(110, "sanjee", 28));
        studentList.add(new Student(500, "sanjee12", 32));
        studentList.add(new Student(277, "Delta", 51));

        // Print un sorted List
        System.out.println(studentList);
        System.out.println("==================================\n");
        Collections.sort(studentList, new Sortbyroll());
        System.out.println(studentList);
        System.out.println("==================================\n");
        Collections.sort(studentList, new SortbyrollAge());
        System.out.println(studentList);
        System.out.println("==================================\n");
        Collections.sort(studentList, new Sortbyname());
        System.out.println(studentList);

    }
    
}
