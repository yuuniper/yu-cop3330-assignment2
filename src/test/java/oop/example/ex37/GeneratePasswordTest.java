package oop.example.ex37;

import org.junit.jupiter.api.Test;

import static com.google.common.base.CharMatcher.is;
import static org.hamcrest.Matchers.isEmptyString;
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