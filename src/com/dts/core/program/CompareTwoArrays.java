package com.dts.core.program;


import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrays {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(1, "John"));
        studentList1.add(new Student(2, "Jane"));
        studentList1.add(new Student(3, "Bob"));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(4, "Alice"));
        studentList2.add(new Student(2, "Jane"));
        studentList2.add(new Student(3, "Bob"));

        // Iterate over studentList1
        for (int i = 0; i < studentList1.size(); i++) {
            Student student = studentList1.get(i);
            int matchingIndex = findMatchingIndex(studentList2, student.getStudentId());

            if (matchingIndex == -1) {
                // If studentId not present in studentList2, update the corresponding record in studentList2
                if(studentList2.get(i) == null) {
                    studentList2.set(i, new Student(11111, "NA"));
                } else {
                    Student tempStudent = studentList2.get(i);
                    studentList2.set(i, new Student(11111, "NA"));
                    studentList2.add(tempStudent);
                }
            } else if (matchingIndex != i) {
                System.out.println("$$$$$$$$$$$$$");
            }
        }

        // Display the updated student lists
        System.out.println("Updated Student List 1:");
        System.out.println(studentList1);

        System.out.println("\nUpdated Student List 2:");
        System.out.println(studentList2);
    }

    // Helper method to find a matching index in studentList2
    private static int findMatchingIndex(List<Student> list, int studentId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    // Helper method to find a unique index in studentList2
    private static int findUniqueIndex(List<Student> list) {
        int index = 0;
//        while (list.stream().anyMatch(student -> student.getStudentId())) {
//            index++;
//        }
        return index;
    }
}
