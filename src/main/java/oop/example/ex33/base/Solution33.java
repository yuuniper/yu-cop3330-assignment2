package oop.example.ex33.base;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Solution33 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What's your question?");
        String prediction = in.nextLine();

        int num = randomNum();
        getFate(num);
    }

    private static void getFate(int num) {
        String [] fate = {"Yes", "No", "Maybe", "Ask again later"};
        if (num == 1){
            System.out.println(fate[0]);
        } else if (num == 2){
            System.out.println(fate[1]);
        } else if (num == 3){
            System.out.println(fate[2]);
        } else {
            System.out.println(fate[3]);
        }
    }

    public static int randomNum(){
        Random rand = new Random();
        return 1 + rand.nextInt(4);
    }
}
