package com.collectionpart2.questionfive.app;

import com.collectionpart2.questionfive.parser.EmployeeInputParser;
import com.collectionpart2.questionfive.solution.HighestSalaryCalculator;
import com.collectionpart2.questionfive.model.Employees;

import java.util.List;
import java.util.Map;

public class EmployeeHighestSalary {
    public static void main(String[] args) {
        try {
            EmployeeInputParser inputParser = new EmployeeInputParser();
            String inputFile = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questionfive/employeeInput.csv";

            final List<Employees> employee = inputParser.parseCSVFile(inputFile);
            HighestSalaryCalculator highestSalary = new HighestSalaryCalculator(employee);

            final Map<String, Employees> resultMap = highestSalary.mapDepartmentwiseEmployee(employee);
            final Map<String, Integer> finalResult = highestSalary.getEmployeeHighestSalary(resultMap);

            System.out.println("Employee IDs of the highest paid employee in each department are : " + finalResult);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
