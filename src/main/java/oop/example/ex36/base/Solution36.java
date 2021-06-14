package oop.example.ex36.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 *  Computing Statistics
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class Solution36 {
    private static final Scanner in = new Scanner(System.in);
    public static ArrayList<Double> nums = new ArrayList<Double>();

    public static void main(String[] args) {
        getInput();
        printArray(nums);

        double average = getAverage(nums);
        double min = getMin(nums);
        double max = getMax(nums);
        double std = getSTD(nums, average);

        printCalculations(average, min, max, std);
    }

    public static void printCalculations(double average, double min, double max, double std) {
        System.out.format("\nThe average is %.2f", average);
        System.out.println("\nThe minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.format("The standard deviation is %.2f", std);
    }

    public static double getSTD(ArrayList<Double> nums, double average) {
        double stdDev = 0;
        for (Double index : nums) {
            stdDev += Math.pow(index - average, 2);
        }
        return Math.sqrt(stdDev / nums.size());
    }

    public static double getMax(ArrayList<Double> nums) {

        return Collections.max(nums);
    }
    public static double getMin(ArrayList<Double> nums) {

        return Collections.min(nums);
    }

    public static double getAverage(ArrayList<Double> nums) {
        double sum = 0.0;
        for (double index : nums) {
            sum += index;
        }
        return sum / nums.size();
    }

    private static void printArray(ArrayList<Double> nums) {
        System.out.print("Numbers: ");
        nums.forEach(index ->{
            System.out.print(index + " ");
        });
    }

    private static void getInput() {
        boolean isValid;
        String temp = null;
        while (true) {
            do {
                try {
                    isValid = false;
                    System.out.print("Enter a number: ");
                    temp = in.next();

                    nums.add(Double.parseDouble(temp));

                } catch (NumberFormatException e) {
                    if (temp.equals("done") || temp.equals("done ")) {
                        return;
                    }
                    isValid = true;
                    System.out.println("Sorry, that's not a valid number");
                }
            } while (isValid == true);
        }
    }
}
