package oop.example.ex26.base;

import java.util.Scanner;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);

    private static double balance;
    private static double apr;
    private static double monthlyPayment;

    public static void main(String[] args) {
        readUserInput();

        PaymentCalculator calc = new PaymentCalculator();
        int result = calc.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment);
        System.out.println("It will take you " + result + " months to pay off this card.");

    }
    public static void readUserInput(){
        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = in.nextDouble();
    }

}
