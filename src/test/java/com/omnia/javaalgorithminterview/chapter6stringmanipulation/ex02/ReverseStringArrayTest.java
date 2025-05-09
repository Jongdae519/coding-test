package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex02;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReverseStringArrayTest {

    private static final String[] INPUT = {"r", "a", "c", "e", "c", "a", "r"};

    @Test
    void test() {
        String[] reversed = MeasureTimeUtils.measureExecutionTime("ReverseStringArrayTest#test", () -> ReverseStringArray.reverseStringArray(INPUT));

        Assertions.assertTrue(Arrays.equals(reversed, INPUT));
    }

    @Test
    void testAnswer() {
        String[] reversed = MeasureTimeUtils.measureExecutionTime("ReverseStringArrayTest#testAnswer", () -> ReverseStringArray.reverseStringArrayAnswer(INPUT));

        Assertions.assertTrue(Arrays.equals(reversed, INPUT));
    }

}