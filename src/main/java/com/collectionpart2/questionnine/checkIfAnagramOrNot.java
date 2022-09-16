package com.collectionpart2.questionnine;

import java.util.*;


public class checkIfAnagramOrNot {
    public static void main(String[] args) {
        String input = "dormitory";
//        String input = "listen";
        String[] candidates = {"enlists", "google", "inlets", "dirty room"};

        List<String> list = anagramList(input, candidates);
        System.out.println(list);

    }

    private static List<String> anagramList(String inputWord, String[] candidates)
    {
        List<String> list = new ArrayList<String>();

        char[] inputChars = inputWord.toCharArray();
//        List<Character> inputCharList = Arrays.asList(inputChars);
//        char[] charArray = str.toCharArray();
//        Character[] charObjectArray = ArrayUtils.toObject(inputChars);
        Set<Character> keySet = new HashSet<>();

//        for (Character ch : inputWord.toCharArray())
//        {
//            keySet.add(ch);
//        }
        for (String word : candidates)
        {
            Set<Character> keySet2 = new HashSet<>();
            for (Character ch : word.replaceAll("\\s", "").toCharArray())
            {
                keySet2.add(ch);
            }
            if (keySet.size() == keySet2.size())
            {
                list.add(word);
            }
        }
        return list;

//        char[] charsInWord = inputWord.toCharArray();
//        Arrays.sort(charsInWord);
//        String key = new String(charsInWord);
//        for (String word : candidates) {
//            char[] wordArray = word.toCharArray();
//            Arrays.sort(wordArray);
//            String candidateKey = new String(wordArray);
//            if (key.replaceAll("\\s","").equals(candidateKey.replaceAll("\\s",""))){
//                list.add(word);
//            }
//        }
    }
}

