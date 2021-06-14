package oop.example.ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */

import java.util.Arrays;
import java.util.Locale;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){

        // convert to lowercase
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // remove all blank spaces
        word1 = word1.replaceAll("\\s", "");
        word2 = word2.replaceAll("\\s", "");

        // check if they're the same length
        if (word1.length() == word2.length()){

            // check if they're the same
            if (word1.equals(word2)){
                return true;
            } else {
                // if they're not the same,
                // run through comprehensive anagram checker

                // convert to char array
                char [] word1Array = word1.toCharArray();
                char [] word2Array = word2.toCharArray();

                // sort both arrays by Array.sort
                Arrays.sort(word1Array);
                Arrays.sort(word2Array);

                // if the sorted arrays are equal
                if (Arrays.equals(word1Array, word2Array)){
                    return true;
                }
            }
        }
            // not an anagram
            return false;
    }
}
