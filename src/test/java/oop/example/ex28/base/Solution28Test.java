package oop.example.ex28.base;

import oop.example.ex27.base.checkInput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void getSumAssertTrue() {
        double sumArray[] = {5, 10, 15, 20, 25.55};
        int delta;
        assertEquals(Solution28.getSum(sumArray), 75.55, 0.001);
    }

    @Test
    void getSumAssertFalse_No_round() {
        double sumArray[] = {5, 10, 15, 20, 25.55};
        int delta;
        assertNotEquals(Solution28.getSum(sumArray), 75, 0.001);
    }
}