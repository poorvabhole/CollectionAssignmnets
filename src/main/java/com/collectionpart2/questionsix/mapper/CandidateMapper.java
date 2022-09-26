package com.collectionpart2.questionsix.mapper;

import com.collectionpart2.questionsix.model.Candidates;

public class CandidateMapper {
    public static Candidates map(String data){
        Candidates candidates;
        try {
            String[] values = data.split(",");
            Integer candidateId = Integer.parseInt(values[0].trim());
            String name = values[1];
            String Constituency = values[2];
            Integer votes = Integer.parseInt(values[3].trim());

            candidates = new Candidates(candidateId,name,Constituency,votes);
        }catch (NumberFormatException exception){
            throw new RuntimeException(exception);
        }
        return candidates;
    }
}
