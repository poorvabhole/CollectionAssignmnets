package com.collectionpart2.questioneight.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IsogramTest {
    public boolean isIsogram(String inputWord){

        Character[] letters = inputWord.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        Set<Character> wordSet = new HashSet<>(Arrays.asList(letters));

        return (wordSet.size() == inputWord.length());
    }
}
