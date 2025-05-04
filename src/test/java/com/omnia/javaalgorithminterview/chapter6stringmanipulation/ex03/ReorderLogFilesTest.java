package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex03;

import com.omnia.javaalgorithminterview.chapter6stringmanipulation.MeasureTimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ReorderLogFilesTest {

    private static final String[] INPUT = {"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"};
    private static final List<String> INPUT_LIST = List.of("id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero");
    private static final String[] OUTPUT = {"id2 art can", "id5 art zero", "id4 own kit dig", "id1 8 1 5 1", "id3 3 6"};
    private static final List<String> OUTPUT_LIST = List.of("id2 art can", "id5 art zero", "id4 own kit dig", "id1 8 1 5 1", "id3 3 6");

    @Test
    void test() {
        String[] reversed = MeasureTimeUtils.measureExecutionTime("ReorderLogFilesTest#test", () -> ReorderLogFiles.reorderLogFiles(INPUT));

        Assertions.assertTrue(Arrays.equals(reversed, OUTPUT));
    }

    @Test
    void test_using_list_input_and_output() {
        List<String> reversed = MeasureTimeUtils.measureExecutionTime("ReorderLogFilesTest#test_using_list_input_and_output", () -> ReorderLogFiles.reorderLogFilesUsingList(INPUT_LIST));

        Assertions.assertTrue(reversed.equals(OUTPUT_LIST));
    }

    @Test
    void test_using_list_input_and_output_and_parse() {
        List<String> reversed = MeasureTimeUtils.measureExecutionTime("ReorderLogFilesTest#test_using_list_input_and_output_and_parse", () -> ReorderLogFiles.reorderLogFilesUsingListAndParse(INPUT_LIST));

        Assertions.assertTrue(reversed.equals(OUTPUT_LIST));
    }

    @Test
    void test_using_list_input_and_output_and_factory() {
        List<String> reversed = MeasureTimeUtils.measureExecutionTime("ReorderLogFilesTest#test_using_list_input_and_output_and_factory", () -> ReorderLogFiles.reorderLogFilesUsingListAndFactory(INPUT_LIST));

        Assertions.assertTrue(reversed.equals(OUTPUT_LIST));
    }

    @Test
    void testAnswer() {
        String[] reversed = MeasureTimeUtils.measureExecutionTime("ReorderLogFilesTest#testAnswer", () -> ReorderLogFiles.reorderLogFilesAnswer(INPUT));

        Assertions.assertTrue(Arrays.equals(reversed, OUTPUT));
    }
}