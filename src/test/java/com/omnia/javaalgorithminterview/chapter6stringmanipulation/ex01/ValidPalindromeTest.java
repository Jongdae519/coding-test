package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex01;

import com.omnia.javaalgorithminterview.chapter6stringmanipulation.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    private static final String INPUT = "Do geese see God?";

    @Test
    void test() {
        boolean result = MeasureTimeUtils.measureExecutionTime("ValidPalindromeTest#test", () -> ValidPalindrome.isPalindrome(INPUT));

        Assertions.assertEquals(result, true);
    }

    @Test
    void testAnswer() {
        boolean result = MeasureTimeUtils.measureExecutionTime("ValidPalindromeTest#testAnswer", () -> ValidPalindrome.isPalindromeAnswer(INPUT));

        Assertions.assertEquals(result, true);
    }
}