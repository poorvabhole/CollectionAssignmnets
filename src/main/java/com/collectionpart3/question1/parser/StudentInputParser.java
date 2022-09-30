package com.collectionpart3.question1.parser;

import com.collectionpart3.question1.model.Student;
import com.collectionpart3.question1.mapper.StudentInputMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {
    public List<Student> parseCSVFile(String filename){
        List<Student> studentList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filename));
            String inputline;
            while ((inputline = bufferedReader.readLine()) != null){
                Student student = StudentInputMapper.map(inputline);
                studentList.add(student);
            }

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException ex){
            throw new RuntimeException(ex);
        }
        return studentList;
    }
}
