package oop.example.ex33.base;

import oop.example.ex32.base.GuessNum;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    public void Solution33_InBounds() {
        // checks if randomly generated a number between 1 and 4
        assertThat(Solution33.randomNum() , allOf(greaterThan(1), lessThan(5)));;
    }
}