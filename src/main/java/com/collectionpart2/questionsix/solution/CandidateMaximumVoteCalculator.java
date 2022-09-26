package com.collectionpart2.questionsix.solution;

import com.collectionpart2.questionsix.model.Candidates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidateMaximumVoteCalculator {

    public Map<String, Candidates> mapCandidateByConstituency(List<Candidates> candidatesList){
        Map<String, Candidates> result = new HashMap<>();
        try{
            for (Candidates candidate : candidatesList) {
                Candidates currentCandidate = result.get(candidate.getConstituency());

                if (currentCandidate == null || currentCandidate.getVotes() < candidate.getVotes()){
                    result.put(candidate.getConstituency(), candidate);
                }
            }
        }catch (NullPointerException exception){
            throw new RuntimeException(exception);
        }
        return result;
    }

    public Map<String, Integer> getCandidateWithMaximumVote(Map<String, Candidates> resultMap){
        Map<String, Integer> candidateMap = new HashMap<>();
        try {
            for (String constituency : resultMap.keySet()) {
                Candidates candidates = resultMap.get(constituency);
                Integer candidateId = candidates.getCandidateId();
                candidateMap.put(constituency,candidateId);
            }
        }catch (NullPointerException e){
            throw new RuntimeException(e);
        }
        return candidateMap;
    }
}
