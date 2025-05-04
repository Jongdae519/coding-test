package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex06;

import com.omnia.javaalgorithminterview.chapter6stringmanipulation.MeasureTimeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubstringTest {

    private static final String INPUT = "dcbabcdd";
    private static final String OUTPUT = "dcbabcd";

    @Test
    void testAnswer() {
        LongestPalindromeSubstring longest = new LongestPalindromeSubstring();
        String result = MeasureTimeUtils.measureExecutionTime("GroupAnagramsTest#testAnswer", () -> longest.longestPalindromeAnswer(INPUT));

        assertEquals(OUTPUT, result);
    }
}