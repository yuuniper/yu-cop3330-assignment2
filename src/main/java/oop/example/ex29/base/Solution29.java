package oop.example.ex29.base;

import java.util.Scanner;

public class Solution29 {
    public static double r;
    public static boolean notValid;

    public static void main(String[] args) {


        GetRInput solve = new GetRInput();

        r = GetRInput.getR(r, notValid);

        int years = (int)Math.ceil(72 / r);

        System.out.println("It will take " + years + " years to double your initial investment.");
    }

}
