package oop.example.ex32.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */
import java.util.Scanner;

public class Solution32 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean runAgain;
        do {
            System.out.println("Let's play Guess the Number!");
            runAgain = false;
            int playerLevel = difficultLevel();

            GuessNum play = new GuessNum();
            int correctNum = play.getNum(playerLevel);
            int numGuesses = play.getRange(correctNum);

            System.out.println("You got it in "+numGuesses+ " guesses!");
            runAgain = playGameAgain();
        } while (runAgain == true);
    }

    private static boolean playGameAgain() {
        System.out.print("Do you wish to play again? ");
        String answer = in.next();

        if (answer.equals("y") || answer.equals("Y")){
            return true;
        }else{
            return false;
        }
    }

    public static int difficultLevel() {
        boolean playAgain;
        int level = 0;
        do{
            try {
                playAgain = false;
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                level = Integer.parseInt(in.next());

                if (level > 3 || level < 1){
                    System.out.println("Sorry, that's not a valid level");
                    playAgain = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, that's not a valid number");
                playAgain = true;
            }
        } while (playAgain == true);
        return level;
    }

}
