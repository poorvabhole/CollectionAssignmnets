package com.collectionpart2.questionfour.app;

import com.collectionpart2.questionfour.model.Student;
import com.collectionpart2.questionfour.solution.AverageMarks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentAverageMarks {

    public static void main(String[] args) throws Exception{
        AverageMarks averageMarks = new AverageMarks();
        List<String> inputList = new ArrayList<>();
        File file = new File("/home/priyab/Edureka_Java/CollectionAssignment2/src/main/java/com/collectionpart2/four/inputfile.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null){
//            System.out.println(inputLine);
            //remove non printable character from input line

            inputList.add(inputLine);

        }

        List<Student> students = averageMarks.getStudents(inputList);

        Integer lowestId = averageMarks.getLowestStudentId(students);
        System.out.println(String.format("lowest id: %d", lowestId));

        Integer average = averageMarks.getAverageMarks(students, lowestId);
        System.out.println(String.format("Average marks scored across all subjects by the student with the lowest ID  ( %d ) is %d", lowestId, average));
    }
}
