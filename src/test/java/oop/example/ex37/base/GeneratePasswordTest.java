package oop.example.ex37.base;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GeneratePasswordTest {

    @Test
    void generateLetters() {
        assertNotEquals(GeneratePassword.generateLetters(2), " ");
    }

    @Test
    void generateNums() {
    }

    @Test
    void generateSpecialChar() {
    }
}