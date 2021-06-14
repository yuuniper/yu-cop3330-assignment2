package oop.example.ex27.base;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class checkInputTest {

    @ParameterizedTest
    @CsvSource({"Dawn, Summers, DS-0789, 44444", "Travis, Yu, TS-9810, 79861"})
    void checkInput_return_true(String firstName, String lastName, String id, String zipcode) {
        assertTrue(checkInput.validateInput(firstName, lastName, id, zipcode));
    }

    @ParameterizedTest
    @CsvSource({"D, Summers, DS-0789, 44444", "T, Y, TS-9810, 79861", "T, Y, T, 79Jk", "Kelly, kim, LI0-90, abcds"})
    void checkInput_return_false(String firstName, String lastName, String id, String zipcode) {
        assertFalse(checkInput.validateInput(firstName, lastName, id, zipcode));
    }
}