package oop.example.ex40.base;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

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
}