package com.collectionpart2.questionone.app;

import com.collectionpart2.questionone.Solution.OutDatedSoftwareInstallOnServer;
import com.collectionpart2.questionone.model.Software;
import com.collectionpart2.questionone.parser.SoftwareInputParser;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OutofDateSoftware {
    public static void main(String[] args) {
        try {
            SoftwareInputParser inputParser = new SoftwareInputParser();
            String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questionone/SoftwareInputFile.csv";
            List<Software> softwareList = inputParser.parseCSVFile(filepath);
            OutDatedSoftwareInstallOnServer outDatedSoftware = new OutDatedSoftwareInstallOnServer(softwareList);
            Map<String, String> outDatedVersionMap = outDatedSoftware.getOutDatedVersionMap();
//            System.out.println(outDatedVersionMap);
            Set<String> outDatedSoftwarePackageNameSet =outDatedSoftware.getOutDatedSoftwarePackageName(outDatedVersionMap);

            System.out.println("List of software package names for which an out-of-date version is installed");
            System.out.println(outDatedSoftwarePackageNameSet);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
