package com.collectionpart2.questionnine;

import java.util.*;

public class CheckIfAnagramOrNot {
    public static void main(String[] args) {
        CheckIfAnagramOrNot anagramOrNot = new CheckIfAnagramOrNot();
        String input = "dormitory";
//        String input = "listen";
        String[] candidates = {"enlists", "google", "inlets", "dirty room"};
//        check whether given text is anagram or not
//        input = given text/word, list of reference words
//        List<String> result = anagramOrNot.isAnagram(input, candidates);

        List<String> list = anagramOrNot.anagramList(input, candidates);
        System.out.println(list);
    }
    private List<String> anagramList(String inputWord, String[] candidates)
    {
        List<String> list = new ArrayList<String>();

        char[] charsInWord = inputWord.toCharArray();
        Arrays.sort(charsInWord);
        String key = new String(charsInWord);

        for (String word : candidates) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);

            String candidateKey = new String(wordArray);
            if (key.replaceAll("\\s","").equals(candidateKey.replaceAll("\\s",""))){
                list.add(word);
            }
        }
        return list;
    }
//    List<Character> inputCharList = Arrays.asList(inputChars);
//    char[] charArray = str.toCharArray();
//    Character[] charObjectArray = ArrayUtils.toObject(inputChars);
}

