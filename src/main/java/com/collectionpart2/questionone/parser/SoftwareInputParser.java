package com.collectionpart2.questionone.parser;

import com.collectionpart2.questionone.mapper.SoftwareInputMapper;
import com.collectionpart2.questionone.model.Server;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SoftwareInputParser {
    public List<Server> parseCSVFile(String filePath){
        List<Server> softwareList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null){
                Server software = SoftwareInputMapper.map(inputLine);
                softwareList.add(software);
            }
        }catch (FileNotFoundException exception){
            throw new RuntimeException(exception);
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return softwareList;
    }
}
