package com.collectionpart2.questionten.app;

import com.collectionpart2.questionten.solution.DoublyLinkedListOperation;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListOperation doublyLinkedListOperation = new DoublyLinkedListOperation();

        doublyLinkedListOperation.push(10);
        doublyLinkedListOperation.push(20);
        doublyLinkedListOperation.push(30);
        doublyLinkedListOperation.push(40);
        doublyLinkedListOperation.push(50);

        doublyLinkedListOperation.printNode();

        doublyLinkedListOperation.shift(10);

        doublyLinkedListOperation.printNode();

    }
}
