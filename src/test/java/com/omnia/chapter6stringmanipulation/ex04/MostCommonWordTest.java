package com.omnia.chapter6stringmanipulation.ex04;

import com.omnia.chapter6stringmanipulation.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostCommonWordTest {

    private static final String INPUT = "Ross hit a ball, the hit BALL flew far away after it was hit.";
    private static final String[] BANNED = {"hit"};
    private static final String OUTPUT = "ball";

    @Test
    public void testAnswer() {
        String result = MeasureTimeUtils.measureExecutionTime("MostCommonWordTest#testAnswer", () -> MostCommonWord.mostCommonWordAnswer(INPUT, BANNED));

        Assertions.assertEquals(result, OUTPUT);
    }
}