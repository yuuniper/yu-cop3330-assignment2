package oop.example.ex31.base;

import oop.example.ex27.base.checkInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @ParameterizedTest
    @CsvSource({"65, 22, 55"})
    void Solution31_set1_true(int restingPulse, int age, int intensity) {
        assertEquals(Solution31.getTargetHR(restingPulse, age, intensity), 138);
    }

    @ParameterizedTest
    @CsvSource({"66, 22, 55"})
    void Solution31_set1_not_true(int restingPulse, int age, int intensity) {
        assertNotEquals(Solution31.getTargetHR(restingPulse, age, intensity), 138);
    }
}