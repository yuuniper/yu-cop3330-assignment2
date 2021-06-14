package oop.example.ex28.base;

import oop.example.ex27.base.checkInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @ParameterizedTest
    @CsvSource({"12, 5, 14, 89, 16"})
    void checkSolution28True(double sum) {
        assertEquals(Solution28.getSum(), 12);
    }
}