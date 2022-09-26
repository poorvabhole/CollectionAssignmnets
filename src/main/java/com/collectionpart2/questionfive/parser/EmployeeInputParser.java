package com.collectionpart2.questionfive.parser;

import com.collectionpart2.questionfive.mapper.EmployeeInputMapper;
import com.collectionpart2.questionfive.model.Employees;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeInputParser {
    public List<Employees> parseCSVFile(String filePath){
        List<Employees> employeesList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null){
                Employees employees = EmployeeInputMapper.map(inputLine);
                employeesList.add(employees);
            }
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employeesList;
    }
}
