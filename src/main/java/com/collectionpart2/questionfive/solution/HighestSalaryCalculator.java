package com.collectionpart2.questionfive.solution;

import com.collectionpart2.questionfive.model.Employees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestSalaryCalculator {
    public Map<String, Employees> mapDepartmentwiseEmployee(List<Employees> employees) {
        // Need to store the ENTIRE Employee as the value to compare salary and
        // later retrieve the ID
        Map<String, Employees> result = new HashMap<String, Employees>();
        for (Employees employee : employees) {
            Employees currEmployee = result.get(employee.getDepartment());

            if (currEmployee == null || currEmployee.getSalary() < employee.getSalary()) {
                result.put(employee.getDepartment(), employee);
            }
        }
        return result;
    }
    public Map<String, Integer> getEmployeeHighestSalary(Map<String, Employees> resultMap){
        Map<String, Integer> finalResult = new HashMap<>();
        for (String department : resultMap.keySet()){
            Employees e = resultMap.get(department);
            Integer id = e.getId();
            finalResult.put(department,id);
        }
        return finalResult;
    }
    public List<Employees> mapInputArrayToListOfEmployee(String[] input){
        List<Employees> employees = new ArrayList<>();
        for (String line: input) {

            String[] values = line.split(",");
            int id = Integer.parseInt(values[0]);
            String name = values[1];
            String department = values[2];
            int salary = Integer.parseInt(values[3]);

            Employees employee = new Employees(id,name,department,salary);
            employees.add(employee);
        }
        return employees;
    }
}
