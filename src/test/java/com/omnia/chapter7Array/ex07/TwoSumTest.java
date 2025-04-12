package com.omnia.chapter7Array.ex07;

import com.omnia.chapter6stringmanipulation.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    private static final int[] INPUT = {2, 6, 11, 15};
    private static final int TARGET = 8;
    private static final int[] OUTPUT = {0, 1};

    @Test
    void test() {
        int[] result = MeasureTimeUtils.measureExecutionTime("TwoSumTest#test", () -> TwoSum.twoSum(INPUT, TARGET));

        Assertions.assertTrue(Arrays.equals(result, OUTPUT));
    }

    @Test
    void testAnswer() {
        int[] result = MeasureTimeUtils.measureExecutionTime("TwoSumTest#testAnswer", () -> TwoSum.twoSumAnswer(INPUT, TARGET));

        Assertions.assertTrue(Arrays.equals(result, OUTPUT));
    }
}