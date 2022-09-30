package com.collectionpart3.question2.parser;

import com.collectionpart3.question2.mapper.ServerInputMapper;
import com.collectionpart3.question2.model.ServerDetails;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerInputParser {
    public List<ServerDetails> parseCSVFile(String filePath){
        List<ServerDetails> serverList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null){
                ServerDetails software = ServerInputMapper.map(inputLine);
                serverList.add(software);
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
        return serverList;
    }
}
