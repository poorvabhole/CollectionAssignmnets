package com.collectionpart2.questioneight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfIsogramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckIfIsogramOrNot checkIfIsogramOrNot = new CheckIfIsogramOrNot();

        System.out.println("Enter the phrase or word to check isogram or not..");
        String word = scanner.next();

        boolean isogramOrNot = checkIfIsogramOrNot.isIsogram(word);
        if (isogramOrNot){
            System.out.println("Given inputWord \""+ word +"\" is an Isogram ");
        }
        else {
            System.out.println("Given inputWord \""+ word +"\" is not an Isogram ");

        }
    }
    private boolean isIsogram(String inputWord){

        Character[] letters = inputWord.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        Set<Character> wordSet = new HashSet<>(Arrays.asList(letters));

        return (wordSet.size() == inputWord.length());
    }
}
