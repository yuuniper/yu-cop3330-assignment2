package oop.example.ex32.base;

import oop.example.ex31.base.Solution31;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;


class GuessNumTest {

    @Test
    public void GuessNumTest_Level1() {
        // checks if randomly generated a number between 1 and 10
        assertThat(GuessNum.getNum(1) , allOf(greaterThan(1), lessThan(10)));;
    }
    @Test
    public void GuessNumTest_Level2() {
        // checks if randomly generated a number between 1 and 100
        assertThat(GuessNum.getNum(2) , allOf(greaterThan(1), lessThan(100)));;
    }
    @Test
    public void GuessNumTest_Level3() {
        // checks if randomly generated a number between 1 and 1000
        assertThat(GuessNum.getNum(3) , allOf(greaterThan(1), lessThan(1000)));;
    }
}