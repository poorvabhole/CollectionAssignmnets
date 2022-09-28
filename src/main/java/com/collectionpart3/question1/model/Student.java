package com.collectionpart3.question1.app;

public class Student {
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Student id : {0}, Name : {1}",id,name);
    }
}
