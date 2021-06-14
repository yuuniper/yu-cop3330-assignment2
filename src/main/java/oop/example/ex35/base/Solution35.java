package oop.example.ex35.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 *  Picking a Winner
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Solution35 {
    public static final Scanner in = new Scanner(System.in);
    public static ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {

        names = makeArrayList();
        int winnerIndex = randomName(names);
        PrintWinner(winnerIndex, names);
    }

    private static void PrintWinner(int winnerIndex, ArrayList<String> names) {
        System.out.println("The winner is... " + names.get(winnerIndex) + ".");
    }

    public static int randomName(ArrayList<String> names) {
        Random rand = new Random();

        int length = names.size(); // Size of the Arraylist
        return rand.nextInt(length); // Generate a random number in the array list
    }

    private static ArrayList<String> makeArrayList() {
        while(true){
            System.out.print("Enter a name: ");
            String temp = in.nextLine();
            if(temp.isBlank()){
                break;
            } else{
                names.add(temp);
            }
        }
        return names;
    }
}
