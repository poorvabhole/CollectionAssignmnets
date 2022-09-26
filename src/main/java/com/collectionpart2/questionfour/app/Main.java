package com.collectionpart2.questionfour.app;

import com.collectionpart2.questionfour.model.Student;
import com.collectionpart2.questionfour.parser.StudentInputParser;
import com.collectionpart2.questionfour.solution.AverageMarksCalculator;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            StudentInputParser inputParser = new StudentInputParser();
            String filePath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questionfour/inputCSVFile.csv";
            List<Student> studentList = inputParser.parseCSVFile(filePath);

            AverageMarksCalculator averageMarks = new AverageMarksCalculator(studentList);

            // get lowest id from the list of students
            final Integer lowestId = averageMarks.getLowestIdFromTheListOfStudents();

            // get average marks for the student having lowest id
            final Double average = averageMarks.getAverageMarksForStudent(lowestId);

            System.out.println(String.format("Average marks scored across all subjects by the student with the lowest ID  ( %d ) is %.2f", lowestId, average));

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
