package oop.example.ex38.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 *  Return Even Array
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution38 {
    public static final Scanner in = new Scanner(System.in);
    public static ArrayList<Integer> evenNums = new ArrayList<Integer>();


    public static void main(String[] args) {
        String notArray = getInput("Enter a list of numbers, separated by spaces: ");
        int [] isArray = convertToArray(notArray);
        evenNums = filterEvenNumbers(isArray);
        printEvenNums(evenNums);
    }

    public static void printEvenNums(ArrayList<Integer> evenNums) {
        System.out.print("The even numbers are");

        for (int i = 0; i < evenNums.size(); i++){
            System.out.print(" " + evenNums.get(i));
        }
        System.out.print(".");
    }

    public static ArrayList<Integer> filterEvenNumbers(int [] isArray) {
        for (int i = 0; i < isArray.length; i++){
            if (isArray[i] % 2 == 0){
                evenNums.add(isArray[i]);
            }
        }
        return evenNums;
    }

    private static int [] convertToArray(String notArray) {
        String [] stringArray =  notArray.split(" ");
        List<String> convert = new ArrayList<String>();
        convert = Arrays.asList(stringArray);

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }
}
