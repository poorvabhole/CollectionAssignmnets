package com.collectionpart3.question2.solution;


import com.collectionpart3.question2.model.ServerDetails;
import com.collectionpart3.question2.model.SoftwarVersionComparator;

import java.lang.module.ModuleDescriptor;
import java.util.*;
import java.util.stream.Collectors;

public class ServerOperations {
    List<ServerDetails> serverList;

    public ServerOperations(List<ServerDetails> serverList) {
        this.serverList = serverList;
    }

    public List<ServerDetails> getSortedListByServerName() {
        Collections.sort(serverList, new Comparator<ServerDetails>() {
            @Override
            public int compare(ServerDetails serverDetails, ServerDetails other) {
                return serverDetails.getServerName().compareTo(other.getServerName());
            }
        });
        return serverList;
    }

    public List<ServerDetails> getSortedListByServerNameAndVersion(List<ServerDetails> sortedServerListByName) {
        Collections.sort(serverList, new Comparator<ServerDetails>() {
            @Override
            public int compare(ServerDetails serverDetails, ServerDetails other) {
                int result = serverDetails.getServerName().compareTo(other.getServerName());
                if (result == 0) {
                    result = serverDetails.getSoftwarePackageName().compareTo(other.getSoftwarePackageName());
                    if (result == 0) {
                        result = serverDetails.getVersion().compareTo(other.getVersion());
                    }
                }
                return result;
            }
        });
        return serverList;
    }

    public List<String> getDistinctServerName() {
        List<String> distinctServerNamelist = serverList.stream()
                .map(ServerDetails::getServerName)
                .distinct()
                .collect(Collectors.toList());

        return distinctServerNamelist;
    }

    public List<ServerDetails> getFilteredRecord(String input) {
        List<ServerDetails> filteredRecordList = serverList.stream()
                .filter(server -> server.getServerName().equals(input))
                .collect(Collectors.toList());
        return filteredRecordList;
    }

    public List<ModuleDescriptor.Version> getSortedVersionList() {
//        List<String> sortedList = new ArrayList<>();
//        String[] array = {};
//        for (List<String> versions : versionMap.values()) {
//            array = new String[versions.size()];
//            for (int i =0; i<array.length; i++) {
//                array[i] = versions.get(i);
//            }
//        }
////        System.out.println("Array");
////        Arrays.stream(array).forEach(e -> System.out.println(e+" "));
//        for (int j = 0; j < array.length; j++){
//            String[] array1 = array[j].split(".");
//            for (int k = 1; k < array.length; k++){
//                String[] array2 = array[k].split(".");
//            }
//        }
        List<ModuleDescriptor.Version> versionsSetOfSoftware = null;
        Set<String> packageNameSet = new HashSet<>();
        for (ServerDetails details : serverList) {
            packageNameSet.add(details.getSoftwarePackageName());
        }
        for (String name : packageNameSet){
             versionsSetOfSoftware=serverList.stream()
                    .filter(server -> server.getSoftwarePackageName().equals(name))
                    .map(server-> server.getVersion())
                    .map(ModuleDescriptor.Version::parse)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
//            versionsSetOfSoftware.forEach(System.out::println);
        }
        return versionsSetOfSoftware;
    }


    public void getMap() {
        Map<String, List<String>> finalMap = new HashMap<>();
        Set<String> packageNameSet = new HashSet<>();
        List<String> list = null;
        List<String> list1 = null;


        for (ServerDetails details : serverList) {
            packageNameSet.add(details.getSoftwarePackageName());
//            SoftwarVersionComparator versionComparator = new SoftwarVersionComparator();

        }
        for (String name : packageNameSet) {
            list = new ArrayList<>();
            for (ServerDetails details : serverList) {
                if (name.equals(details.getSoftwarePackageName())) {
                    list.add(details.getVersion());

                    finalMap.put(name,list);
                }
            }
//            getSortedVersionList(finalMap);

        }

        Map<String, List<String>> map = serverList.stream().collect(Collectors.toMap(key -> key.getSoftwarePackageName(), value-> value.getVersion(),(a, b) -> a + ", " + b));
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
        System.out.println(map.values());
        for (Map.Entry<String>:
             ) {

        }
        SoftwarVersionComparator versionComparator = new SoftwarVersionComparator();
//        map.forEach((key, value) -> versionComparator.compare(value, ));

    }
}
