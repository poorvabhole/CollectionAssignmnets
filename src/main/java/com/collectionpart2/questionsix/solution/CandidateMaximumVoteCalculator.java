package com.collectionpart2.questionsix.solution;

import com.collectionpart2.questionsix.model.Candidates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidateMaximumVoteCalculator {

    public Map<String, Candidates> mapCandidateByConstituency(List<Candidates> candidatesList){
        Map<String, Candidates> result = new HashMap<>();

        for (Candidates candidate : candidatesList) {
            Candidates currentCandidate = result.get(candidate.getConstituency());

            if (currentCandidate == null || currentCandidate.getVotes() < candidate.getVotes()){
                result.put(candidate.getConstituency(), candidate);
            }
        }
        return result;
    }

    public Map<String, Integer> getCandidateWithMaximumVote(Map<String, Candidates> resultMap){
        Map<String, Integer> candidateMap = new HashMap<>();

        for (String constituency : resultMap.keySet()) {
            Candidates candidates = resultMap.get(constituency);
            Integer candidateId = candidates.getCandidateId();
            candidateMap.put(constituency,candidateId);
        }

        return candidateMap;
    }
    public List<Candidates> mapArrayToListOfCandidates(String[] input){
        List<Candidates> employees = new ArrayList<>();
        for (String line: input) {

            String[] values = line.split(",");
            int candidateId = Integer.parseInt(values[0]);
            String name = values[1];
            String Constituency = values[2];
            int votes = Integer.parseInt(values[3]);

            Candidates candidates = new Candidates(candidateId,name,Constituency,votes);
            employees.add(candidates);
        }
        return employees;
    }

}
