package com.collectionpart2.questionfive.mapper;

import com.collectionpart2.questionfive.model.Employees;

public class EmployeeInputMapper {
    public static Employees map(String data){
        Employees employees;
        try {
            String[] values = data.split(",");
            Integer id = Integer.parseInt(values[0].trim());
            String name = values[1];
            String department = values[2];
            Integer salary = Integer.parseInt(values[3].trim());
            employees = new Employees(id,name,department,salary);
        }catch (NumberFormatException ex){
            throw new RuntimeException(ex);
        }
        return employees;
    }
}
