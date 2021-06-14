    package oop.example.ex39.base;
    /*
     *  UCF COP3330 Summer 2021 Assignment 2 Solution
     *  Copyright 2021 Alice Yu
     */

    import com.google.common.collect.ListMultimap;
    import com.google.common.collect.MultimapBuilder;

    import java.util.*;
    ;

    public class Solution39 {
        //public static ListMultimap<String, String> multimap = ArrayListMultimap.create();
        public static ListMultimap<String, String> multimap =
                MultimapBuilder.treeKeys().arrayListValues().build();

        public static void main(String[] args) {
            addToMM();
            //sortMM();
            //printMM();
            printMMinterate();
        }

        private static void printMMinterate() {
            System.out.println("Name                | Position          | Separation Date");
            System.out.println("--------------------|-------------------|----------------");

            /*Iterator<Map.Entry<String, String>> iterator = multimap.entries().iterator();

            Map.Entry<String, String> entry = null;
            int counter = 1;

            while(iterator.hasNext()){

                entry = iterator.next();
                System.out.print( entry.getKey() + "=>" + entry.getValue() );
                counter++;
            }*/
            int counter = 0;
            for (String key : multimap.keySet()) {
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
                System.out.println();
            }
        }

        private static void printMM(){
            System.out.println("Name                | Position          | Separation Date");
            System.out.println("--------------------|-------------------|----------------");
            /*for (String lastName: multimap.keySet()) {
                System.out.println(lastName + ": \t" + multimap.get(lastName));
            }*/
            Collection<Map.Entry<String, String>> entries = multimap.entries();
            /*for (int i = 0; i < multimap.keySet().size(); i++){
                System.out.format("%-10s", multimap.get(i));
            }*/
            //for(String key : multimap.keySet()) {
                //System.out.print(key+ " ");
                //System.out.format("%-19s |", key);
                /*for(String entry : multimap.keySet(key)){
                    System.out.format("%-19s |", entry.getValue());
                    for(String v : multimap.values()) {
                    System.out.format("%-19s |", v);
                }
                }*/
                /*for (String s : multimap.get(key)) {

                    System.out.format("%-19s |", s);
                }*/

                /*for (int i = 0; i < multimap.keySet().size(); i++ )
                {
                    System.out.format("%-19s |", multimap.keySet();

                }*/
                /*for(Map.Entry<String, String> entry : entries){
                    System.out.println( entry.getValue() );
                }
                for (int i = 0; i < 3; i++){
                    if (i == 0){
                        System.out.print(multimap.keySet(multimap);
                    }
                }*/
                for (String key : multimap.keySet()) {
                    System.out.print(key);
                    /*for (String value : multimap.get(key)) {
                        System.out.print("   " + value);
                    }*/
                    /*for (int i = 0; i < 3; i++){
                        List<String> value = multimap.get(key);
                    }*/
                    System.out.println();
                }
                //System.out.println("");
            }




        public static void addToMM() {
            multimap.put("Johnson", "John");
            multimap.put("Johnson", "Manager");
            multimap.put("Johnson", "2016-12-31");

            multimap.put("Tou", "Xiong");
            multimap.put("Tou", "Software Engineer");
            multimap.put("Tou", "2016-10-05");

            multimap.put("Michaelson", "Michaela");
            multimap.put("Michaelson", "District Manager");
            multimap.put("Michaelson", "2015-12-19");

            multimap.put("Jacobson", "Jake");
            multimap.put("Jacobson", "Programmer");
            multimap.put("Jacobson", "");

            multimap.put("Jackson", "Jacquelyn");
            multimap.put("Jackson", "DBA");
            multimap.put("Jackson", "");

            multimap.put("Webber", "Sally");
            multimap.put("Webber", "Web Developer");
            multimap.put("Webber", "2015-12-18");

        }

    }
