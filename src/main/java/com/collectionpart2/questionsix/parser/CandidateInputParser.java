package com.collectionpart2.questionsix.parser;

import com.collectionpart2.questionsix.mapper.CandidateMapper;
import com.collectionpart2.questionsix.model.Candidates;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CandidateInputParser {
    public List<Candidates> parseArray(String inputfile) {
        List<Candidates> candidatesList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(inputfile));
            String inputLine;
            while ((inputLine = bufferedReader.readLine()) != null) {
                Candidates candidates = CandidateMapper.map(inputLine);
                candidatesList.add(candidates);
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return candidatesList;
    }
}
