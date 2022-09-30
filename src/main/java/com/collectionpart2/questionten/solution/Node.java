package com.collectionpart2.questionten.solution;

public class Node {
    Integer data;
    Node previous;
    Node next;

    public Node(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }
}
