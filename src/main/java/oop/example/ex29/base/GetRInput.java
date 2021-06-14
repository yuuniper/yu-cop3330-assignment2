package oop.example.ex29.base;

import java.util.Scanner;

public class GetRInput {
    public static final Scanner in = new Scanner(System.in);

    public static double getR(double r, boolean notValid) {
        do {
            try {
                notValid = false;
                System.out.print("What is the rate of return? ");
                String num = in.next();

                r = Double.parseDouble(num);

                if (r == 0){
                    System.out.println("Sorry, that's not a valid number");
                    notValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, that's not a valid number");
                notValid = true;
            }

        } while(notValid == true);

        return r;
    }

    public static int getYears(double r) {
        int years = (int)Math.ceil(72 / r);
        return years;
    }
}
