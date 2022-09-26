package com.collectionpart2.questionfour.model;

public class Student {
    private Integer id;
    private String subject;
    private Integer marks;

    public Student(Integer id, String subject, Integer marks) {
        this.id = id;
        this.subject = subject;
        this.marks = marks;
    }
    public Integer getId() {
        return id;
    }
    public String getSubject() {
        return subject;
    }
    public Integer getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("id: {0}, subject: {1}, marks: {2}, {1} {1} {0} ", id, subject, marks);

    }
}
