package com.collectionpart2.questionnine;

import java.util.*;


public class checkIfAnagramOrNot {
    public static void main(String[] args) {
        checkIfAnagramOrNot anagramOrNot = new checkIfAnagramOrNot();
//        String input = "dormitory";
        String input = "listen";
        String[] candidates = {"enlists", "google", "inlets", "dirty room"};

        List<String> list = anagramOrNot.anagramList(input, candidates);
        System.out.println(list);

    }
    private List<String> anagramList(String inputWord, String[] candidates)
    {
        List<String> list = new ArrayList<String>();

        Character[] inputWordLetters = inputWord.chars()
                                        .mapToObj(c -> (char) c)
                                        .toArray(Character[]::new);

        Set<Character> letterSet = new HashSet<>(Arrays.asList(inputWordLetters));
        System.out.println(letterSet );

        for (String word : candidates ) {
            Character[] charactersInWord = word.chars()
                                            .mapToObj(c -> (char) c)
                                            .toArray(Character[]::new);
            Set<Character> wordLetterSet = new HashSet<>(Arrays.asList(charactersInWord));
            if (letterSet.size() == wordLetterSet.size()){
                list.add(word);
            }
        }
        return list;

//        char[] inputChars = inputWord.toCharArray();
//        List<Character> inputCharList = Arrays.asList(inputChars);
//        char[] charArray = str.toCharArray();
//        Character[] charObjectArray = ArrayUtils.toObject(inputChars);

//        String word = "word";
        
//        Set<Character> keySet = new HashSet<>();
//        for (Character ch : inputWord.toCharArray())
//        {
//            keySet.add(ch);
//        }
//        for (String word : candidates)
//        {
//            Set<Character> keySet2 = new HashSet<>();
//            for (Character ch : word.replaceAll("\\s", "").toCharArray())
//            {
//                keySet2.add(ch);
//            }
//            if (keySet.size() == keySet2.size())
//            {
//                list.add(word);
//            }
//        }


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

