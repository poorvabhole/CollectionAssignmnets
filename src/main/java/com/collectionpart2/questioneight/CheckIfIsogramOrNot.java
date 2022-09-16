package com.collectionpart2.questioneight;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfIsogramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the phrase or word to check isogram or not..");
        String word = scanner.next();
        isIsogram(word);
    }
    private static void isIsogram(String word){
        Set<Character> wordSet = new HashSet<Character>();
        String input = word.toLowerCase();
        char[] characters = input.toCharArray();
        for (char ch: characters ) {
            wordSet.add(ch);
        }
        if (wordSet.size() == input.length()){
            System.out.println("Given word "+word+" is an Isogram ");
        }
        else {
            System.out.println("Given word "+word+" is not an Isogram ");
        }
    }
}
