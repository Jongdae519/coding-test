package com.omnia.bytbytego.twopointers.ispalindromevalid;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsPalindromeValidTest {

    private static final String INPUT = "hello, world!";
    private static final String INPUT2 = "12.02.2021";

    @Test
    void test() {
        boolean result = MeasureTimeUtils.measureExecutionTime("IsPalindromeValidTest#test", () -> IsPalindromeValid.isPalindromeValid(INPUT));

        Assertions.assertEquals(result, false);
    }

    @Test
    void test2() {
        boolean result = MeasureTimeUtils.measureExecutionTime("IsPalindromeValidTest#test2", () -> IsPalindromeValid.isPalindromeValid(INPUT2));

        Assertions.assertEquals(result, true);
    }

}