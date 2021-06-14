package oop.example.ex32.base;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    private static final Scanner in = new Scanner(System.in);
    public static int getNum(int playerLevel) {

        Random rand = new Random();
        int correctNum = 0;

        if (playerLevel == 1){
            correctNum = 1 + rand.nextInt(10);
            //correctNum = 5;
        }
        if (playerLevel == 2){
            correctNum = 1 + rand.nextInt(100);
        }
        if (playerLevel == 3){
            correctNum = 1 + rand.nextInt(1000);
        }
        return correctNum;
    }

    public static int getRange(int correctNum) {
        boolean tryAgain;
        System.out.print("I have my number. What's your guess? ");
        int num, counter = 1;
        do{
            try {
                tryAgain = false;

                num = Integer.parseInt(in.next());

                if (num == correctNum){

                    return counter;
                }
                if (num < correctNum){
                    System.out.print("Too low. ");
                } else {
                    System.out.print("Too high. ");
                }
                System.out.print("Guess again: ");

                tryAgain = true;
                counter++;

            } catch (NumberFormatException e) {
                System.out.println("Sorry, that's not a valid number");
                System.out.print("Guess again: ");
                tryAgain = true;
            }
        } while (tryAgain == true);
        return counter;
    }
}
