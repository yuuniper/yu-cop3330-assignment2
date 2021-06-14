package oop.example.ex29.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GetRInputTest {

    @ParameterizedTest
    @CsvSource({"12, true", "6, true"})
    void getR(double r, boolean notValid) {
        //assertTrue(GetRInput.getR(r, notValid));
    }
}