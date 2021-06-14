package oop.example.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */
import java.util.Scanner;

public class RemoveEmployee {
    public static final Scanner in = new Scanner(System.in);

    public static String findEmployeeRemove() {
        System.out.print("Enter an employee name to remove: ");
        return in.nextLine();
    }

    public static String removeEmp(String [] employeeList, String exEmp) {
        String temp = "";
        for(int i = 0; i < employeeList.length; i++){
            if (employeeList[i].equals(exEmp)){
                temp = employeeList[i];
                employeeList[i] = "";
            }
        }
        return temp;
    }
}
