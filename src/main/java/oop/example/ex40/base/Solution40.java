package oop.example.ex40.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alice Yu
 */

import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;

import java.util.Collection;
import java.util.Map;

public class Solution40 {
    public static ListMultimap<String, String> multimap =
            MultimapBuilder.treeKeys().arrayListValues().build();

    public static void main(String[] args) {
        addToMM();
        FindString finder = new FindString();
        finder.filter();

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


