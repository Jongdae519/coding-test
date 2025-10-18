package com.omnia.bytbytego.pairsum;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class PairSumTest {

    private static final ArrayList<Integer> INPUT = new ArrayList<>(Arrays.asList(-5,-2,3,4,6));

    @Test
    void test() {
        ArrayList<Integer> result = MeasureTimeUtils.measureExecutionTime("PairSum#pair_sum_sorted", () -> PairSum.pairSumSorted(INPUT, 7));

        Assertions.assertEquals(result, new ArrayList<>(Arrays.asList(2,3)));
    }

}