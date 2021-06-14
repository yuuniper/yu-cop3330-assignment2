package oop.example.ex39.base;

import java.util.Collection;

import static oop.example.ex39.base.Solution39.multimap;

public class doMultimap {
    public static void printMM() {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|--------------------");

        int counter = 0;
        for (String key : multimap.keySet()) {
            for (String value : multimap.get(key)) {
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
            System.out.println();
        }
    }
}



