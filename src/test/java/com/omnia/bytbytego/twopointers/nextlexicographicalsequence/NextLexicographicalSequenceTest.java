package com.omnia.bytbytego.twopointers.nextlexicographicalsequence;

import com.omnia.common.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class NextLexicographicalSequenceTest {

    private static Stream<Arguments> testCases() {
        return Stream.of(
                arguments("a", "a"),
                arguments("aaaa", "aaaa"),
                arguments("ynitsed", "ynsdeit")
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void test(String input, String expected) {
        String output = MeasureTimeUtils.measureExecutionTime("NextLexicographicalSequenceTest#test", () -> NextLexicographicalSequence.nextLexicographicalSequence(input));

        Assertions.assertEquals(output, expected);
    }
}