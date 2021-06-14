package oop.example.ex27.base;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner in = new Scanner(System.in);

    private static String firstName;
    private static String lastName;
    private static String id;
    private static String zipcode;

    public static void main(String[] args) {
        readUserInput();

        checkInput user = new checkInput();
        boolean result = user.validateInput(firstName, lastName, id, zipcode);
        if (result == true){
            System.out.println("There were no errors found.");
        }
    }
    public static void readUserInput(){
        System.out.print("Enter the first name: ");
        firstName = in.next();

        System.out.print("Enter the last name: ");
        lastName = in.next();

        System.out.print("Enter the ZIP code: ");
        zipcode = in.next();

        System.out.print("Enter the employee ID: ");
        id = in.next();
    }
}
