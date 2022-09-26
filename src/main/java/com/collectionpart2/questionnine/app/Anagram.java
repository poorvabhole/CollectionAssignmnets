package com.collectionpart2.questionnine.app;

import com.collectionpart2.questionnine.solution.AnagramTest;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        AnagramTest anagramTest = new AnagramTest();
        String input = "dormitory";
//        String input = "listen";
        String[] candidates = {"enlists", "google", "inlets", "dirty room"};
        List<String> list = anagramTest.anagramList(input, candidates);
        System.out.println(list);
    }

//    List<Character> inputCharList = Arrays.asList(inputChars);
//    char[] charArray = str.toCharArray();
//    Character[] charObjectArray = ArrayUtils.toObject(inputChars);
}

