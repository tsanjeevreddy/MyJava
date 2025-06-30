package com.dts.core.program.dataCompare.comparator;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student> {

    // Sorting in ascending order of roll number
    // Compare method returns -1, 0, or 1 to say if it is less than, equal, or greater to the other. 
    // It uses this result to then determine if they should be swapped for their sort.
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }
    
}
