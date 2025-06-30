package com.dts.core.program.dataCompare.comparable;

public class JavaStudent implements Comparable<JavaStudent> {
    int rollno;
    String name;
    int age;

    public JavaStudent() {
    }

    public JavaStudent(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Java Student [rollno=" + this.rollno + ", name=" + this.name + ", age=" + this.age + "]";
    }

    @Override
    public int compareTo(JavaStudent jsd) {
        if(this.age == jsd.age) {
            return 0;
        } else if (this.age > jsd.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
