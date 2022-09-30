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
    public void pop(Integer data){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

    }
    public void shift(Integer data){
        Node newNode = new Node(data);
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (head == newNode){
            head = newNode.next;
        }
        if (newNode.next != null){
            newNode.next.previous = newNode.previous;
        }
        if (newNode.previous != null){
            newNode.previous.next = newNode.next;
        }
        return;
    }
    public void printNode() {
        Node currNode = head;
        if(head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        while(currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
