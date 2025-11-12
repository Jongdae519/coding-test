package com.omnia.bytbytego.twopointers.shiftzerostotheend;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class ShiftZerosToTheEndTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                arguments(new ArrayList<>(List.of()), new ArrayList<>(List.of())),
                arguments(new ArrayList<>(List.of(0)), new ArrayList<>(List.of(0))),
                arguments(new ArrayList<>(List.of(1)), new ArrayList<>(List.of(1))),
                arguments(new ArrayList<>(List.of(0, 0, 0)), new ArrayList<>(List.of(0, 0, 0))),
                arguments(new ArrayList<>(List.of(1, 3, 2)), new ArrayList<>(List.of(1, 3, 2))),
                arguments(new ArrayList<>(List.of(1, 1, 1, 0, 0)), new ArrayList<>(List.of(1, 1, 1, 0, 0))),
                arguments(new ArrayList<>(List.of(0, 0, 1, 1, 1)), new ArrayList<>(List.of(1, 1, 1, 0, 0)))
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void test(ArrayList<Integer> nums, ArrayList<Integer> expected) {
        MeasureTimeUtils.measureExecutionTime("ShiftZerosToTheEndTest#test", () -> ShiftZerosToTheEnd.shiftZerosToTheEndNaive(nums));

        Assertions.assertEquals(nums, expected);
    }
}