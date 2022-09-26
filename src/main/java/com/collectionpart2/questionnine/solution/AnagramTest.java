package com.collectionpart2.questionnine.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramTest {
    public List<String> anagramList(String inputWord, String[] candidates)
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
}
