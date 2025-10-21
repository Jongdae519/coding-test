package com.omnia.bytbytego.twopointers.largestcontainer;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class LargestContainerTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                arguments(new ArrayList<>(List.of()), 0),
                arguments(new ArrayList<>(List.of(1)), 0),
                arguments(new ArrayList<>(List.of(0, 1, 0)), 0),
                arguments(new ArrayList<>(List.of(3, 3, 3, 3)), 9),
                arguments(new ArrayList<>(List.of(1, 2, 3)), 2),
                arguments(new ArrayList<>(List.of(3, 2, 1)), 2)
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void test(ArrayList<Integer> heights, int expected) {
        int result = MeasureTimeUtils.measureExecutionTime("LargestContainerTest#test", () -> LargestContainer.largestContainer(heights));

        Assertions.assertEquals(result, expected);
    }
}