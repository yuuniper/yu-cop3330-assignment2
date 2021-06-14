package oop.example.ex28.base;

import java.util.Scanner;

public class Solution28 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;

        for(int i = 1; i <= 5; i++){
            sum += getSum();
        }

        System.out.println("The total is " + sum);
    }

    public static double getSum() {
        double num = 0;
            System.out.print("Enter a number: ");
             num = in.nextDouble();
        return num;
    }
}
