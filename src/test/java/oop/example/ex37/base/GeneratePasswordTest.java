package oop.example.ex37.base;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GeneratePasswordTest {

    @Test
    void scramble_not_same() {
        String inOrder = "alphabetSoup123$$%";
        assertNotEquals(Solution37.scramble(inOrder), inOrder);
    }
}
