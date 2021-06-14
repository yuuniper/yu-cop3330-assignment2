package oop.example.ex29.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GetRInputTest {

    @ParameterizedTest
    @CsvSource({"12", "12.0", "13.33"})
    void getYears_true_for_ints_doubles_and_checks_ceil(double r) {
        assertEquals(GetRInput.getYears(r), 6);
    }

    @ParameterizedTest
    @CsvSource({"6", "6.33"})
    void getYears_not_true_for_ints_doubles_and_checks_ceil(double r) {
        assertNotEquals(GetRInput.getYears(r), 11);
    }
}