package com.collectionpart2.questionfour.mapper;

import com.collectionpart2.questionfour.model.Student;

public class StudentMapper {
    public static Student map(String data){
        Student student;
        try {
            String[] values = data.split(", ");

            Integer id = Integer.parseInt(values[0]);
            String subject = values[1];
            Integer marks = Integer.parseInt(values[2]);
            student = new Student(id, subject, marks);
        }catch (NumberFormatException exception){
            throw new RuntimeException(exception);
        }
        return student;
    }
}
