package com.omnia.chapter6stringmanipulation.ex03;

import com.omnia.chapter6stringmanipulation.ex02.ReverseStringArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReorderLogFileTest {

    public static final String[] INPUT = {"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"};
    public static final String[] OUTPUT = {"id2 art can", "id5 art zero", "id4 own kit dig", "id1 8 1 5 1", "id3 3 6"};

    @Test
    void test() {
        Instant startTime = Instant.now();

        String[] reversed = ReorderLogFile.reorderLogFile(INPUT);
        Assertions.assertTrue(Arrays.equals(reversed, OUTPUT));

        Instant endTime = Instant.now();

        System.out.println("ReverseStringArrayTest#test: " + Duration.between(startTime, endTime).toNanos() + " ns");
    }

    @Test
    void testAnswer() {
        Instant startTime = Instant.now();

        String[] reversed = ReorderLogFile.reorderLogFileAnswer(INPUT);
        Assertions.assertTrue(Arrays.equals(reversed, OUTPUT));

        Instant endTime = Instant.now();

        System.out.println("ReverseStringArrayTest#testAnswer: " + Duration.between(startTime, endTime).toNanos() + " ns");
    }
}