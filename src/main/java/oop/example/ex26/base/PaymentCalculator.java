package oop.example.ex26.base;

import static java.lang.Math.*;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment){
        double i = (apr / 100.0) / 365;
        double firstHalf = (Math.log10(1 + (balance/monthlyPayment * (1 - Math.pow((1 + i), 30)))) / -30);
        double months =  (firstHalf / (Math.log10(1 + i)));

        months = Math.ceil(months);

        return (int)months;
    }
}
