package oop.example.ex29.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */
import java.util.Scanner;

public class Solution29 {
    public static double r;
    public static boolean notValid;

    public static void main(String[] args) {


        GetRInput solve = new GetRInput();
        r = solve.getR(r, notValid);
        int years = solve.getYears(r);

        System.out.println("It will take " + years + " years to double your initial investment.");
    }


}
