package com.collectionpart2.four.model;

public class Student {
    private Integer Id;
    private String subject;
    private Integer marks;

    public Student(Integer id, String subject, Integer marks) {
        Id = id;
        this.subject = subject;
        this.marks = marks;
    }

    public Integer getId() {
        return Id;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return String.format("ID = %3d "+Id+", Subject = %s "+subject+", Marks = %3d "+marks);
    }
}
