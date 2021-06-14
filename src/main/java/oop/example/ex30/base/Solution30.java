package oop.example.ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */

public class Solution30 {
    public static void main(String[] args) {

        boolean check = printTable(12);
    }

    public static boolean printTable(int n) {
        int i = 0, j = 0;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                System.out.format("%4d", i * j);
            }
            System.out.print("\n");
        }
        if ((i-1) * (j-1) == n * n){ // check ran through all array indexes
            return true;
        }else{
            System.out.println(i * j +"and "+ n * n);
            return false;
        }
    }
}
