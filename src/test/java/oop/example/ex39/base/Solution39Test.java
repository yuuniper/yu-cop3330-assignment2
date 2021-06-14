package oop.example.ex39.base;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    @Test
    void addToMultiMap_assert_true() {
        ListMultimap<String, String> multimap =
                MultimapBuilder.treeKeys().arrayListValues().build();
            multimap.put("Roland", "Kevin");
            multimap.put("Roland", "WebDev");
            Assert.assertEquals(2, multimap.get("Roland").size());

    }
}