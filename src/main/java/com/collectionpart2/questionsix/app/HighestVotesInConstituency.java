package com.collectionpart2.questionsix.app;

import com.collectionpart2.questionsix.model.Candidates;
import com.collectionpart2.questionsix.parser.CandidateInputParser;
import com.collectionpart2.questionsix.solution.CandidateMaximumVoteCalculator;

import java.util.List;
import java.util.Map;

public class HighestVotesInConstituency {
    public static void main(String[] args) {
        try {
            CandidateInputParser inputParser = new CandidateInputParser();
            String filepath = "/home/priyab/CollectionAssignmnets/src/main/java/com/collectionpart2/questionsix/CandidateInputfile.csv";
            List<Candidates> candidatesList = inputParser.parseArray(filepath);
            CandidateMaximumVoteCalculator candidateWithMaxVotes = new CandidateMaximumVoteCalculator();
            final Map<String, Candidates> candidateMap = candidateWithMaxVotes.mapCandidateByConstituency(candidatesList);

            final Map<String, Integer> candidateResultMap = candidateWithMaxVotes.getCandidateWithMaximumVote(candidateMap);
            System.out.println("Constituency with highest votes " + candidateResultMap);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

    }
}

