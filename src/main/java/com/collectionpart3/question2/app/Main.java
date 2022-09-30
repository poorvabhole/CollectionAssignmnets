package com.collectionpart3.question2.app;

import com.collectionpart3.question2.model.ServerDetails;
import com.collectionpart3.question2.parser.ServerInputParser;
import com.collectionpart3.question2.solution.ServerOperations;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Question 1
        ServerInputParser inputParser = new ServerInputParser();
        String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart3/question2/ServerInfoInputFile.csv";
        List<ServerDetails> serverInfoList = inputParser.parseCSVFile(filepath);
//        serverInfoList.forEach(System.out::println);

        ServerOperations serverOperations = new ServerOperations(serverInfoList);

//        Question 2
        List<ServerDetails> sortedServerListByName = serverOperations.getSortedListByServerName();
//        sortedServerListByName.forEach(System.out::println);

//        Question 3
        List<ServerDetails> sortedServerListByNameAndVersion = serverOperations.getSortedListByServerNameAndVersion(sortedServerListByName);
//        sortedServerListByNameAndVersion.forEach(System.out::println);


//        Question 4
        List<String> distinctServerNameList = serverOperations.getDistinctServerName();
//        System.out.println(distinctServerNameList);
//        distinctServerNameList.forEach(System.out::println);

//        Question 5
        String serverName = "Server2";
        List<ServerDetails> filteredList = serverOperations.getFilteredRecord(serverName);
//        filteredList.forEach(System.out::println);

//        Question 6
//        serverOperations.getMap();
        serverOperations.getMap();
    }
}
