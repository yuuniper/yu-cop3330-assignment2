package oop.example.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_the_right_answer_same_word() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean expected = true;
        boolean actual = detector.isAnagram("difo", "difo");

        // then
        assertTrue(actual);
    }
    @Test
    void isAnagram_returns_true_for_diff_words(){
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "fido");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_diff_num_spaces_and_capitalized(){
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("Slot Machines", "Cash Lost in Me");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_diff_words(){
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "god");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_similar_words(){
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "difo s");

        // then
        assertFalse(actual);
    }
}