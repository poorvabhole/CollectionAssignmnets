package com.collectionpart3.question1.mapper;

import com.collectionpart3.question1.model.Student;

public class StudentInputMapper {

    public static Student map(String data) {
        Student students;
        try {
            String[] values = data.split(",");
            Integer id = Integer.parseInt(values[0].trim());
            String name = values[1].trim();
            students = new Student(id,name);
        }catch (NumberFormatException e){
            throw new RuntimeException(e);
        }
        return students;
    }
}
