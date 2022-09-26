package com.collectionpart2.questionone.Solution;

import com.collectionpart2.questionone.model.Software;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OutDatedSoftwareInstallOnServer {
    List<Software> softwareList;

    public OutDatedSoftwareInstallOnServer(List<Software> softwareList) {
        this.softwareList = softwareList;
    }

    public Map<String,String> getOutDatedVersionMap(){
        Map<String,String> outDatedVersionMap = new HashMap<>();
        try {
            for (Software software : softwareList){
                String currentpackageName = software.getSoftwarePackageName();
                String version = software.getVersion();
                if (outDatedVersionMap.containsKey(currentpackageName)){
                    String latestVersion = outDatedVersionMap.get(currentpackageName);
                    if (latestVersion.compareTo(version) < 0){
                        version = latestVersion;
                    }
                }
                outDatedVersionMap.put(currentpackageName,version);
            }
        }catch (NullPointerException ex){
            throw new RuntimeException(ex);
        }
        return outDatedVersionMap;
    }

    public void getOutOfDateSoftware(Map<String, String> versionMap){

    }
}
