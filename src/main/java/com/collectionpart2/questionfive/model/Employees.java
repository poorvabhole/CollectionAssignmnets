package com.collectionpart2.questionfive.model;

public class Employees {
    private Integer id;
    private String name;
    private String department;
    private Integer salary;

    public Employees(Integer id, String name, String department, Integer salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("id :{0}, name :{1}, department :{2}, salary :{3}",
                                                id,name,department,salary);
    }
}
