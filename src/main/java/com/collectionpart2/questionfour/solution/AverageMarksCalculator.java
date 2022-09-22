package com.collectionpart2.questionfour.solution;

import com.collectionpart2.questionfour.model.Student;

import java.util.List;

public class AverageMarksCalculator {
    private List<Student> studentList;
    public AverageMarksCalculator(List<Student> students) {
        this.studentList = students;
    }

    public Double getAverageMarksForStudent(Integer lowestId) {
        Double sum = 0.0;
        Integer count = 0;
        Double average;
        for (Student student : studentList) {
            if (lowestId == student.getId()) {
                sum += student.getMarks();
                count++;
            }
        }
        average = sum / count;
        return average;
    }
    public Integer getLowestIdFromTheListOfStudents() {
        Integer lowestId = studentList.get(0).getId();
        for (Student student : studentList) {
            if (lowestId > student.getId()) {
                lowestId = student.getId();
            }
        }
        return lowestId;
    }
}
