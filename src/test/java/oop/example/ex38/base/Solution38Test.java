package oop.example.ex38.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbers() {
        int isArray[]  = {1, 2, 4, 7, 9 ,10, 18, 49, 65};
        List<Integer> evenNums = Arrays.asList( 2, 4, 10, 18);

        boolean equals = Solution38.filterEvenNumbers(isArray).equals(evenNums);
        assertTrue(equals);
    }
}