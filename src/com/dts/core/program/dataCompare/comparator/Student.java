package com.dts.core.program.dataCompare.comparator;

public class Student {
    int rollno;
    String name;
    int age;

    public Student() {
    }

    public Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAddress() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
    }
    
}
