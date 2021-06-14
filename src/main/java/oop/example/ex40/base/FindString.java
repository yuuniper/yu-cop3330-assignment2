package oop.example.ex40.base;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import static oop.example.ex40.base.Solution40.multimap;

public class FindString {
    private static final Scanner in = new Scanner(System.in);
    public void filter() {
        String s = getInput();
        printMMinterate(s);
    }

    public static void printMMinterate(String find) {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        /*for (Map.Entry<String, Collection<String>> entry :
                multimap.asMap().entrySet()) {
            String key = entry.getKey();
            Collection<String> values = entry.getValue();
            for (String value : values) {
                if (value.contains(find) || key.contains(find)){
                    System.out.print(key + " " + value);
                }
            }
        }*/
        //System.out.println(multimap.get("Jackson"));
        int counter = 1;
        for (Map.Entry<String, String> entry : multimap.entries()) {
            String key = entry.getKey(), value = entry.getValue();
            {
                if (value.contains(find) || key.contains(find)){
                    if (counter == 1 || counter % 3 == 1){
                        System.out.print(key + " " + value);
                    }
                    //System.out.print(multimap.get(key));
                }
                //System.out.println(counter);
            }

            counter++;
        }
        /*int counter = 0;
        for (String key : multimap.keySet()) {
            if (key.contains(find))
            System.out.print(key + " ");
            for (String value : multimap.get(key)) {
                //counter++;
                if (counter == 1 || counter % 4 == 1){
                    //System.out.print(value + "|");
                    //System.out.format(" %-5s |", value);
                    System.out.format(" %-19s |", value);
                } else {
                    System.out.format(" %-12s |", value);
                }

                //System.out.print(counter);
            }
            System.out.println();*/
    }
    private String getInput() {
        System.out.print("Enter a search string: ");
        return in.next();
    }

}
