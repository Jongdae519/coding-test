package com.omnia.leetcode.topinterview150;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private static final int[] INPUT_NUMS1 = {1, 2, 3, 0, 0, 0};
    private static final int INPUT_M = 3;
    private static final int[] INPUT_NUMS2 = {2, 5, 6};
    private static final int INPUT_N = 3;
    private static final int[] OUTPUT = {1, 2, 2, 3, 5, 6};

    @Test
    void test() {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        MeasureTimeUtils.measureExecutionTime("MergeSortedArrayTest#test", () -> mergeSortedArray.merge(INPUT_NUMS1, INPUT_M, INPUT_NUMS2, INPUT_N));

        assertArrayEquals(INPUT_NUMS1, OUTPUT);
    }
}