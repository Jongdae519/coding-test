package com.omnia.chapter6stringmanipulation.ex02;

import com.omnia.chapter6stringmanipulation.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReverseStringArrayTest {

    public static final String[] INPUT = {"r", "a", "c", "e", "c", "a", "r"};

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