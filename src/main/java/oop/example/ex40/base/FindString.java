package oop.example.ex40.base;

import oop.example.ex39.base.Solution39;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import static oop.example.ex40.base.Solution40.multimap;

public class FindString {
    private static final Scanner in = new Scanner(System.in);

    public void filter() {
        String s = getInput();
        boolean isMatch = findAndPrintMultiMap(s);
        //System.out.println(isMatch);
    }

    public static boolean findAndPrintMultiMap(String find) {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        int counter = 0;
        boolean isMatch = false;
        for (String key : multimap.keySet()) {
            isMatch = false;
            for (String value : multimap.get(key)) {

                if (value.contains(find) || key.contains(find)){
                    isMatch = true;
                    if(counter == 0 || counter % 3 == 0) {
                        System.out.format("%1$-9s", value); // first name
                    }
                    counter++;
                    if (counter == 1 || counter % 3 == 1) {
                        System.out.format(" %1$-10s|", key); // last name
                    } else {
                        System.out.format(" %1$-17s |", value); // position and separation date
                    }
                }
            }
            if (isMatch)
            {
                System.out.println();
            }
        }
        return isMatch;
    }
    private String getInput() {
        System.out.print("Enter a search string: ");
        return in.next();
    }
}
