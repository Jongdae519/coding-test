package com.omnia.bytbytego.twopointers.tripletsum;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TripletSumTest {

    private static final ArrayList<Integer> INPUT = new ArrayList<>(List.of(0, 0, 1, -1, 1, -1));
    private static final ArrayList<ArrayList<Integer>> OUTPUT = new ArrayList<>(List.of(new ArrayList<>(List.of(-1, 0, 1))));

    @Test
    void test() {
        ArrayList<ArrayList<Integer>> result = MeasureTimeUtils.measureExecutionTime("TripletSumTest#test", () -> TripletSum.tripletSum(INPUT));

        Assertions.assertTrue(result.equals(OUTPUT));
    }
}