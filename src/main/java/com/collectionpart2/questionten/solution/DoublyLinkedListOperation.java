package com.collectionpart2.questionten.solution;

public class DoublyLinkedListOperation {
    public Node head;

    // insert value at front
    public void unshift(Integer data){
        Node newNode = new Node(data);
        newNode.previous = null;
        newNode.next = head;

        if (head != null){
            head.previous = newNode;
        }
        head = newNode;
    }
    // insert value at end
    public void push(Integer data){
        Node newNode = new Node(data);
        Node temporary = head;
        newNode.next = null;
        if (head == null){
            newNode.previous = null;
            head = newNode;
            return;
        }
        while (temporary != null){
            temporary = temporary.next;
        }
    }
}
