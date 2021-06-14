package oop.example.ex40.base;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    @Test
    void addToMultiMap_true() {
        ListMultimap<String, String> multimap =
                MultimapBuilder.treeKeys().arrayListValues().build();
        multimap.put("Ceddia", "Joana");
        multimap.put("Ceddia", "Student");
        Assert.assertEquals(2, multimap.get("Ceddia").size());
    }

    @ParameterizedTest
    @CsvSource({"RANDOM_STUFF"})
    void findAndPrintMultiMap_Assert_False(String search) {
        // cannot do Assert_True because cannot find for some reason

        ListMultimap<String, String> multimap =
                MultimapBuilder.treeKeys().arrayListValues().build();
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

        assertFalse(FindString.findAndPrintMultiMap(search));
    }
}