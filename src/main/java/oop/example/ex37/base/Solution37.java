package oop.example.ex37.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 *  Random Password Generator
 */

import java.util.*;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in);
    public static ArrayList<String> amalgamate = new ArrayList<String>();

    public static void main(String[] args) {
        int length = getInput("What's the minimum length? ");
        int specialChar = getInput("How many special characters? ");
        int numbers = getInput("How many numbers? ");

        GeneratePassword getPw = new GeneratePassword();
        String unscrambledPass = getPw.getPassword(length, specialChar, numbers);

        String scrambledPass = scramble(unscrambledPass);
        System.out.println("Your password is " + scrambledPass);
    }

    public static String scramble(String unscrambledPass) {
        StringBuilder result = new StringBuilder();
        List<String> scrambleMe = Arrays.asList(unscrambledPass.split(""));
        Collections.shuffle(scrambleMe);

        for (String letter : scrambleMe) {
            result.append(letter);
        }
        return result.toString();
    }

    private static int getInput(String prompt) {
        System.out.print(prompt);
        return in.nextInt();
    }
}
