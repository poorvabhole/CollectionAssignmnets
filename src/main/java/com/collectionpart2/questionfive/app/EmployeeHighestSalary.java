package com.collectionpart2.questionfive.app;

import com.collectionpart2.questionfive.solution.HighestSalaryCalculator;
import com.collectionpart2.questionfive.model.Employees;

import java.util.List;
import java.util.Map;

public class EmployeeHighestSalary {
    static String[] input = {"22,Rajan Anand,Engineering,1600000",
            "23,Swati Patil,Testing,800000",
            "27,Vijay Chawda,Engineering,800000",
            "29,Basant Mahapatra,Engineering,600000",
            "32,Ajay Patel,Testing,350000",
            "34,Swaraj Birla,Testing,350000"};

    public static void main(String[] args) {
        HighestSalaryCalculator highestSalary = new HighestSalaryCalculator();
        List<Employees> employee = highestSalary.mapInputArrayToListOfEmployee(input);

        Map<String, Employees> resultMap = highestSalary.mapDepartmentwiseEmployee(employee);

        Map<String, Integer> finalResult = highestSalary.getEmployeeHighestSalary(resultMap);
        System.out.println("Employee IDs of the highest paid employee in each department are : "+ finalResult);
    }
}
