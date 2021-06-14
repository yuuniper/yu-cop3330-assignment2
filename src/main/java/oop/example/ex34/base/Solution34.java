package oop.example.ex34.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */
import java.util.Scanner;

public class Solution34 {
    public static final Scanner in = new Scanner(System.in);
    public static String [] employeeList = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

    public static void main(String[] args) {
        int length = employeeList.length;
        PrintEmployees(length);

        RemoveEmployee remove = new RemoveEmployee();

        String exEmp = remove.findEmployeeRemove();
        String nonExistEmp = remove.removeEmp(employeeList, exEmp);
        length = length - 1;

        PrintEmployees(length);

    }

    private static void PrintEmployees(int numEmployee) {
        int size = employeeList.length;

        System.out.println("There are " + numEmployee + " employees.");

        for (int i = 0; i < size; i++){
            if(!employeeList[i].isBlank()){
                System.out.println(employeeList[i]);
            }
        }
    }
}
