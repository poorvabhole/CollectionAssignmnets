package com.collectionpart2.questionfour.parser;

import com.collectionpart2.questionfour.mapper.StudentMapper;
import com.collectionpart2.questionfour.model.Student;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {
//    public List<Student> parseArray(String[] inputData){
//        List<Student> students = new ArrayList<Student>();
//        for (String data: inputData) {
//            Student student = StudentMapper.map(data);
//            students.add(student);
//        }
//        return students;
//    }
    public List<Student> parseCSVFile(String filePath){
        List<Student> studentsList = new ArrayList<Student>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String inputLine;

            while ((inputLine = bufferedReader.readLine()) != null){
                Student student = StudentMapper.map(inputLine);
                studentsList.add(student);
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException ex){
            System.out.println(ex);
        }
        return studentsList;
    }
}
