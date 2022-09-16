package com.collectionpart2.questionfour.app;

import com.collectionpart2.questionfour.model.Student;

public class ToStringTest {
    public static void main(String[] args) {
        Student student = new Student(1,"java", 50);
        System.out.println(student.toString());
    }
}
