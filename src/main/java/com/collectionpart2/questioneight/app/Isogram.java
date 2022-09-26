package com.collectionpart2.questioneight.app;

import com.collectionpart2.questioneight.solution.IsogramTest;
import java.util.Scanner;

public class Isogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IsogramTest isogramTest = new IsogramTest();

        System.out.println("Enter the phrase or word to check isogram or not..");
        String word = scanner.next();

        boolean isogramOrNot = isogramTest.isIsogram(word);
        if (isogramOrNot){
            System.out.println("Given inputWord \""+ word +"\" is an Isogram ");
        }
        else {
            System.out.println("Given inputWord \""+ word +"\" is not an Isogram ");

        }
    }

}
