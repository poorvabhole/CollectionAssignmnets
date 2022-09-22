package com.collectionpart2.questionsix.parser;

import com.collectionpart2.questionsix.mapper.CandidateMapper;
import com.collectionpart2.questionsix.model.Candidates;

import java.util.ArrayList;
import java.util.List;

public class CandidateInputParser {
    public List<Candidates> parseArray(String[] inputData){
        List<Candidates> candidatesList = new ArrayList<>();
        for (String data: inputData) {
            Candidates candidates = CandidateMapper.map(data);
            candidatesList.add(candidates);
        }
        return candidatesList;
    }
}
