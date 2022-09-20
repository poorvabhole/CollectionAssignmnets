package com.collectionpart2.questionfour.solution;

import com.collectionpart2.questionfour.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AverageMarksCalculator {
    public Double getAverageMarks(List<Student> students, Integer lowestId) {
        Double sum = 0.0;
        Integer count =0;
        Double average;
        for (Student student: students) {
            if (lowestId == student.getId()) {
                sum += student.getMarks();
                count++;
            }
        }
        average =  sum / count;
        return average;
    }
    public Integer getLowestStudentId(List<Student> students) {
        Integer lowestId = students.get(0).getId();
        for (Student student: students) {
            if (lowestId > student.getId()) {
                lowestId = student.getId();
            }
        }
        return lowestId;
    }
    public List<Student> mapArrayToListOfStudent(List<String> inputList) {
        List<Student> students = new ArrayList<Student>();

        for (String line: inputList) {
            String[] values = line.split(",");

            Integer id = Integer.parseInt(values[0].trim());
            String subject = (values[1].trim()) ;
            Integer marks = Integer.parseInt(values[2].trim());

            Student student = new Student(id, subject, marks);
            students.add(student);
        }
        return students;
    }
}
