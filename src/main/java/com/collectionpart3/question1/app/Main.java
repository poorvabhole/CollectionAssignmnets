package com.collectionpart3.question1.app;

import com.collectionpart3.question1.model.Student;
import com.collectionpart3.question1.parser.StudentInputParser;
import com.collectionpart3.question1.solution.StudentOperations;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Question 1
        StudentInputParser inputParser = new StudentInputParser();
        String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart3/question1/StudentInputFile.csv";
        List<Student> studentList = inputParser.parseCSVFile(filepath);

//        Question 2
        StudentOperations studentOperations = new StudentOperations(studentList);
        List<Student> sortedList = studentOperations.getsortedListByName();
        System.out.println("\n--------- Sorted list by Name -------");
//        sortedList.forEach(System.out::println);

//        Question 3
        List<Student> sortedListById = studentOperations.getSortedListById();
        System.out.println("\n--------- Sorted list by Id -------");
//        sortedListById.forEach(System.out::println);

//        Question 4
        List<Student> filteresList = studentOperations.getFilteredList();
        System.out.println("\n----- Filtered student list whose Id is greater than 23 ------");
//        filteresList.forEach(System.out::println);

//        Question 5
        List<Student> studentNameListByLength = studentOperations.getStudentNameListByLength();
        System.out.println("\n------- Student name having length greater than 5 -----");
//        studentNameListByLength.forEach(System.out::println);

//        Question 6
        Map<Integer,Student> studentMap = studentOperations.getStudentMap();
        System.out.println("\n ------ Student Map ------");
//        studentMap.values().stream().forEach(System.out::println);
        System.out.println(studentMap);
    }

}
