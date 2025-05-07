package com.omnia.javaalgorithminterview.chapter7Array.ex08;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {

    private static final int[] INPUT = {1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    private static final int OUTPUT = 6;

    @Test
    void testAnswer() {
        int result = MeasureTimeUtils.measureExecutionTime("TrappingRainWaterTest#testAnswer", () -> TrappingRainWater.trapAnswer( INPUT));

        Assertions.assertEquals(result, OUTPUT);
    }

    @Test
    void testAnswerWithStack() {
        int result = MeasureTimeUtils.measureExecutionTime("TrappingRainWaterTest#testAnswerWithStack", () -> TrappingRainWater.trapAnswerWithStack(INPUT));

        Assertions.assertEquals(result, OUTPUT);
    }
}