package com.collectionpart2.questionsix.app;

import com.collectionpart2.questionsix.model.Candidates;
import com.collectionpart2.questionsix.solution.CandidateWithMaxVotes;

import java.util.List;

public class HighestVotes {
    static String[] input = {
        "22, Ravi Pawar, Aundh, 1603",
        "23, Suvarna Kale, Baner, 803",
        "27, Vinod Chavan, Aundh, 809",
        "29, Vasant Mahajan, Aundh, 617",
        "32, Aarti Patil, Baner, 351",
        "34, Swaran Bijur, Baner, 352"};

    public static void main(String[] args) {
        CandidateWithMaxVotes candidateWithMaxVotes = new CandidateWithMaxVotes();
        List<Candidates> candidatesList = candidateWithMaxVotes.getEmployees(input);
    }
}
