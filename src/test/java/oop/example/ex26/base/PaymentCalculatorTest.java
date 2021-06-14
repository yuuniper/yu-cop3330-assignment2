package oop.example.ex26.base;

import oop.example.ex28.base.Solution28;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @ParameterizedTest
    @CsvSource({"5000, 12, 100"})
    void PaymentCalculatorTest_True(double balance, double apr, double monthlyPayment) {
        assertEquals(PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment), 70);
    }

    @ParameterizedTest
    @CsvSource({"5000, 12, 100"})
    void PaymentCalculatorTest_Not_True(double balance, double apr, double monthlyPayment) {
        assertNotEquals(PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthlyPayment), 50);
    }
}