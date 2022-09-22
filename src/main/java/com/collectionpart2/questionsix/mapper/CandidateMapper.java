package com.collectionpart2.questionsix.mapper;

import com.collectionpart2.questionsix.model.Candidates;

public class CandidateMapper {
    public static Candidates map(String data){
        String[] values = data.split(",");
        int candidateId = Integer.parseInt(values[0]);
        String name = values[1];
        String Constituency = values[2];
        int votes = Integer.parseInt(values[3]);

        Candidates candidates = new Candidates(candidateId,name,Constituency,votes);
        return candidates;
    }
}
