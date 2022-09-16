package com.collectionpart2.questionsix.model;

public class Candidates {
    private Integer candidateId;
    private String name;
    private String Constituency;
    private Integer votes;

    public Candidates(Integer candidateId, String name, String constituency, Integer votes) {
        this.candidateId = candidateId;
        this.name = name;
        Constituency = constituency;
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
        return Constituency;
    }

    public void setConstituency(String constituency) {
        Constituency = constituency;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return String.format(
                "candidateId = %3d" + candidateId + ", name= %s" + name +
                ", Constituency = %s" + Constituency +
                ", votes = %4d" + votes);
    }
}
