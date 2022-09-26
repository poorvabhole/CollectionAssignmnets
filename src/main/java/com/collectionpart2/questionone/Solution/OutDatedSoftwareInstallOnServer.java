package com.collectionpart2.questionone.Solution;

import com.collectionpart2.questionone.model.Software;

import java.util.*;

public class OutDatedSoftwareInstallOnServer {
    List<Software> softwareList;

    public OutDatedSoftwareInstallOnServer(List<Software> softwareList) {
        this.softwareList = softwareList;
    }

    public Map<String, String> getOutDatedVersionMap() {
        Map<String, String> outDatedVersionMap = new HashMap<>();
        try {
            for (Software software : softwareList) {
                String currentpackageName = software.getSoftwarePackageName();
                String version = software.getVersion();
                if (outDatedVersionMap.containsKey(currentpackageName)) {
                    String latestVersion = outDatedVersionMap.get(currentpackageName);
                    if (latestVersion.compareTo(version) < 0) {
                        version = latestVersion;
                    }
                }
                outDatedVersionMap.put(currentpackageName, version);
            }
        } catch (NullPointerException ex) {
            throw new RuntimeException(ex);
        }
        return outDatedVersionMap;
    }

    public Set<String> getOutDatedSoftwarePackageName(Map<String, String> versionMap) {
        List<String> packageNameList = new ArrayList<>();
        Set<String> outdatedPackageNameSet = new HashSet<>();
        Set<String> packageNameSet = new HashSet<>();
        try {
            for (Software software : softwareList) {
                if (versionMap.containsKey(software.getSoftwarePackageName()) && versionMap.containsValue(software.getVersion())) {
                    packageNameList.add(software.getSoftwarePackageName());
                }
            }
            for (String packageName : packageNameList) {
                if (!packageNameSet.add(packageName)) {
                    outdatedPackageNameSet.add(packageName);
                }
            }
        } catch (NullPointerException ex) {
            throw new RuntimeException(ex);
        }
        return outdatedPackageNameSet;
    }
}
