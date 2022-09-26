package com.collectionpart2.questionfour.parser;

import com.collectionpart2.questionfour.mapper.StudentMapper;
import com.collectionpart2.questionfour.model.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {
    public List<Student> parseCSVFile(String filePath) {
        List<Student> studentsList = new ArrayList<Student>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String inputLine;

            while ((inputLine = bufferedReader.readLine()) != null) {
                Student student = StudentMapper.map(inputLine);
                studentsList.add(student);
            }
//            bufferedReader.close();
        } catch (FileNotFoundException e) {
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
        return studentsList;
    }
}
