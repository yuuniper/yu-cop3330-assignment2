package oop.example.ex28.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */
import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;

        double valuesArrays[] = fillArray();
        sum = getSum(valuesArrays);

        System.out.println("The total is " + sum);
    }

    public static double getSum(double[] valuesArrays) {
        double sum = 0;
        for(double i : valuesArrays){
            sum += i;
        }
        return sum;
    }

    private static double [] fillArray() {

        double SumArray[] = new double[5];

        for(double i : SumArray){
            i = getInput();
        }
        return SumArray;
    }

    public static double getInput() {
        double num = 0;
            System.out.print("Enter a number: ");
             num = in.nextDouble();
        return num;
    }
}
