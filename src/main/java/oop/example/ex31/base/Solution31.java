package oop.example.ex31.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in);
    private static int restingPulse, age, targetHR;
    private static boolean isValid;

    public static void main(String[] args) {
        readUserInput();
        System.out.println("Resting Pulse: " + restingPulse + "        Age: " + age + "\n");
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        for (int i = 55; i <= 95; i+= 5){
            targetHR = getTargetHR(restingPulse, age, i);
            System.out.println(i + "%          | " + targetHR + " bpm");
        }
    }
    public static void readUserInput() {
        do{
            try {
                isValid = false;
                System.out.print("Enter resting pulse: ");
                restingPulse = Integer.parseInt(in.next());

                System.out.print("Enter the age: ");
                age = Integer.parseInt(in.next());

            } catch(NumberFormatException e){
                isValid = true;
                System.out.println("Sorry, that's not a valid number");
            }
        }  while (isValid == true);
    }

    public static int getTargetHR(int restingPulse, int age, int intensity){
        double hr = ((((220 - age) - restingPulse) * (intensity/100.0)) + restingPulse);
        return (int)Math.round(hr);
    }
}
