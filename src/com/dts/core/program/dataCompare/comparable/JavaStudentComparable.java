package com.dts.core.program.dataCompare.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class JavaStudentComparable {
    public static void main(String[] as) {
        ArrayList<JavaStudent> al = new ArrayList<JavaStudent>();
        al.add(new JavaStudent(101, "Vijay", 23));
        al.add(new JavaStudent(106, "Ajay", 27));
        al.add(new JavaStudent(105, "Jai", 21));
        System.out.println("Before Sort ==> " + al);
        Collections.sort(al);
        System.out.println("After Sort ==> " + al);
    }
}
