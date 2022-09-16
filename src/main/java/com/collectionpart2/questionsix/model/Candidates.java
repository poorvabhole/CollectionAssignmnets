package com.collectionpart2.questionsix.model;

public class Candidates {
    private Integer candidateId;
    private String name;
    private String constituency;
    private Integer votes;

    public Candidates(Integer candidateId, String name, String constituency, Integer votes) {
        this.candidateId = candidateId;
        this.name = name;
        this.constituency = constituency;
        this.votes = votes;
    }

    public Integer getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(Integer candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("candidateId :{0}, name :{1}, constituency :{2},"+
                                                " votes :{3}", candidateId, name, constituency, votes);
    }
}
