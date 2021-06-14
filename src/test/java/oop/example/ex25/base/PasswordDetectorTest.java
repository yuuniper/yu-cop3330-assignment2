package oop.example.ex25.base;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordDetectorTest {

    @ParameterizedTest
    @CsvSource({"pascal", "ducks!!"})
    void passwordValidator_true_return_2(String password) {
        assertEquals(PasswordDetector.passwordValidator(password), 2);
    }
    @ParameterizedTest
    @CsvSource({"1234", "09423!@"})
    void passwordValidator_true_return_1(String password) {
        assertEquals(PasswordDetector.passwordValidator(password), 1);
    }
    @ParameterizedTest
    @CsvSource({"OnigiriRice7", "DutchCakes90"})
    void passwordValidator_true_return_3(String password) {
        assertEquals(PasswordDetector.passwordValidator(password), 3);
    }
    @ParameterizedTest
    @CsvSource({"alphabetSoup90!", "RainbowSparkles55%"})
    void passwordValidator_true_return_4(String password) {
        assertEquals(PasswordDetector.passwordValidator(password), 4);
    }

    @ParameterizedTest
    @CsvSource({"fling", "fun", "@@"})
    void passwordValidator_not_true_return_1(String password) {
        assertNotEquals(PasswordDetector.passwordValidator(password), 1);
    }

    @ParameterizedTest
    @CsvSource({"funsiess", "1234funn"})
    void passwordValidator_not_true_return_2(String password) {
        assertNotEquals(PasswordDetector.passwordValidator(password), 2);
    }
    @ParameterizedTest
    @CsvSource({"sugarhigh!", "^32421#7"})
    void passwordValidator_not_true_return_3(String password) {
        assertNotEquals(PasswordDetector.passwordValidator(password), 3);
    }
    @ParameterizedTest
    @CsvSource({"453432!", "apple7!"})
    void passwordValidator_not_true_return_4(String password) {
        assertNotEquals(PasswordDetector.passwordValidator(password), 4);
    }

}