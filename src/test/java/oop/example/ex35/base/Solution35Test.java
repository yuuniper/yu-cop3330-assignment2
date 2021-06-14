package oop.example.ex35.base;

import oop.example.ex32.base.GuessNum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

class Solution35Test {

    @Test
    void randomName_is_true_in_bounds() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jennie");
        names.add("Hera");
        names.add("Joo Dan Tae");
        names.add("Oh Yoon Hee");
        names.add("Shim Su Ryeon");

        int length = names.size();
        assertThat(Solution35.randomName(names) , allOf(greaterThan(-1), lessThan(length)));

    }
}