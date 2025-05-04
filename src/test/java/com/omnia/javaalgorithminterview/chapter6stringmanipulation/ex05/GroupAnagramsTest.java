package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex05;


import com.omnia.javaalgorithminterview.chapter6stringmanipulation.MeasureTimeUtils;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest implements WithAssertions {

    private static final String[] INPUT = {"eat", "tea", "tan", "ate", "ant", "cat"};
    private static final List<List<String>> OUTPUT = List.of(List.of("ate", "eat", "tea"), List.of("ant", "tan"), List.of("cat"));

    @Test
    void testAnswer() {
        List<List<String>> result = MeasureTimeUtils.measureExecutionTime("GroupAnagramsTest#testAnswer", () -> GroupAnagrams.groupAnagramsAnswer(INPUT));

        assertThat(result)
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(OUTPUT);
    }
}