package com.collectionpart2.questionfour.app;

import com.collectionpart2.questionfour.model.Student;
import com.collectionpart2.questionfour.solution.AverageMarksCalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentAverageMarks {

    public static void main(String[] args) throws Exception{
        AverageMarksCalculator averageMarks = new AverageMarksCalculator();
        List<String> inputList = new ArrayList<>();

        File file = new File("/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questionfour/inputfile.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null){
            inputList.add(inputLine);
        }

        List<Student> students = averageMarks.mapArrayToListOfStudent(inputList);

        Integer lowestId = averageMarks.getLowestStudentId(students);

        Double average = averageMarks.getAverageMarks(students, lowestId);
        System.out.println(String.format("Average marks scored across all subjects by the student with the lowest ID  ( %d ) is %.2f", lowestId, average));
    }
}
