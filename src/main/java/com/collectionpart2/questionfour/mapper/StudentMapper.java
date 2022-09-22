package com.collectionpart2.questionfour.mapper;

import com.collectionpart2.questionfour.model.Student;

public class StudentMapper {
    public static Student map(String data){
        String[] values = data.split(", ");

        Integer id = Integer.parseInt(values[0]);
        String subject = values[1];
        Integer marks = Integer.parseInt(values[2]);
        Student student = new Student(id, subject, marks);

        return student;
    }
}
