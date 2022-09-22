package com.collectionpart2.questionsix.app;

import com.collectionpart2.questionsix.model.Candidates;
import com.collectionpart2.questionsix.parser.CandidateInputParser;
import com.collectionpart2.questionsix.solution.CandidateMaximumVoteCalculator;

import java.util.List;
import java.util.Map;

public class HighestVotesInConstituency {
    static String[] input = {
        "22, Ravi Pawar, Aundh,1603",
        "23, Suvarna Kale, Baner,803",
        "27, Vinod Chavan, Aundh,809",
        "29, Vasant Mahajan, Aundh,617",
        "32, Aarti Patil, Baner,351",
        "34, Swaran Bijur, Baner,352"};

    public static void main(String[] args) {
        CandidateInputParser inputParser = new CandidateInputParser();
        List<Candidates> candidatesList = inputParser.parseArray(input);
        CandidateMaximumVoteCalculator candidateWithMaxVotes = new CandidateMaximumVoteCalculator();
//        List<Candidates> candidatesList = candidateWithMaxVotes.mapArrayToListOfCandidates(input);

        Map<String, Candidates> candidateMap = candidateWithMaxVotes.mapCandidateByConstituency(candidatesList);

        Map<String, Integer> candidateResultMap = candidateWithMaxVotes.getCandidateWithMaximumVote(candidateMap);
        System.out.println("Constituency with highest votes "+candidateResultMap);
    }
}

