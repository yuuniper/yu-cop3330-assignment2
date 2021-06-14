package oop.example.ex25.base;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in);

    private static String password;

    public static void main(String[] args) {

        readUserInput();

        PasswordDetector check = new PasswordDetector();
        int result = check.passwordValidator(password);
        printOutput(result);

    }

    public static void readUserInput(){
        System.out.print("Enter in your password: ");
        password = in.nextLine();
    }

    public static void printOutput(int result){
        System.out.print("The password '" + password + "' is ");

        if (result == 1){
            System.out.println("a very weak password.");
        } else if (result == 2){
            System.out.println("a weak password.");
        } else if (result == 3){
            System.out.println("a strong password.");
        } else if (result == 4){
            System.out.println("a very strong password.");
        } else {
            System.out.println("an average password");
        }
    }
}
