package com.collectionpart2.four.solution;

import com.collectionpart2.four.model.Student;

import java.util.ArrayList;
import java.util.List;

public class AverageMarks {
    public int getAverageMarks(List<Student> students, int lowestId) {
        int sum = 0;
        int average;
        for (Student student: students) {
            if (lowestId == student.getId()) {
                sum += student.getMarks();
            }
        }
        average = sum / students.size();
        return average;
    }
    public int getLowestStudentId(List<Student> students) {
        int lowestId = students.get(0).getId();
        for (Student student: students) {
            if (lowestId > student.getId()) {
                lowestId = student.getId();
            }
        }
        return lowestId;
    }

    public List<Student> getStudents(List<String> inputList) {
        List<Student> students = new ArrayList<Student>();

        for (String line: inputList) {
            String[] values = line.split(",");

            for (String value : values) {
                System.out.println(value);
                System.out.println(value.length());
            }
            Integer id = Integer.parseInt(values[0].trim());
            String subject = (values[1].trim()) ;
            Integer marks = Integer.parseInt(values[2].trim());

            Student student = new Student(id, subject, marks);
            students.add(student);
        }
        return students;
    }
}
