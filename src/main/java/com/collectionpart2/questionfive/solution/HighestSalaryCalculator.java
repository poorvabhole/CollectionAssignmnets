package com.collectionpart2.questionfive.solution;

import com.collectionpart2.questionfive.model.Employees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestSalaryCalculator {
    List<Employees> employees;

    public HighestSalaryCalculator(List<Employees> employees) {
        this.employees = employees;
    }

    public Map<String, Employees> mapDepartmentwiseEmployee(List<Employees> employees) {
        Map<String, Employees> result = new HashMap<String, Employees>();
        try {
            for (Employees employee : employees) {
                Employees currEmployee = result.get(employee.getDepartment());

                if (currEmployee == null || currEmployee.getSalary() < employee.getSalary()) {
                    result.put(employee.getDepartment(), employee);
                }
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public Map<String, Integer> getEmployeeHighestSalary(Map<String, Employees> resultMap) {
        Map<String, Integer> finalResult = new HashMap<>();
        try {
            for (String department : resultMap.keySet()) {
                Employees e = resultMap.get(department);
                Integer id = e.getId();
                finalResult.put(department, id);
            }
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
        return finalResult;
    }
}
