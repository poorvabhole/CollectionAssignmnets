package com.collectionpart3.question2.solution;

import com.collectionpart3.question2.model.ServerDetails;
import com.collectionpart3.question2.model.SoftwareVersionComparator;
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

    public Map<String, SortedSet<String>> getSortedMap() {

//        Map<String, SortedSet<String>> newMap = new HashMap<>();
//        SortedSet<String> sortedVersions = new TreeSet<>(new SoftwarVersionComparator());
//        Map<String, String> map = serverList.stream().collect(Collectors.toMap(ServerDetails::getSoftwarePackageName, ServerDetails::getVersion, (s, a) -> s + ", " + a));
//        System.out.println(map.values());
//        SoftwarVersionComparator versionComparator = new SoftwarVersionComparator();
//        map.forEach((key, value) -> System.out.println(key + " " + value));

        Map<String, SortedSet<String>> versionMap = serverList.stream()
                .collect(Collectors.toMap(
                        ServerDetails::getSoftwarePackageName,
                        server -> {
                            SortedSet<String> versions = new TreeSet<>(new SoftwareVersionComparator());
                            versions.add(server.getVersion());
                            return versions;
                        },
                        (prev, current) -> {
                            prev.addAll(current);
                            return prev;
                        }
                ));
        return versionMap;
    }
}
