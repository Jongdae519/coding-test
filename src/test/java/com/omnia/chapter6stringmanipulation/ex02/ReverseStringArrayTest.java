package com.omnia.chapter6stringmanipulation.ex02;

import com.omnia.chapter6stringmanipulation.ex01.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

class ReverseStringArrayTest {

    public static final String[] INPUT = {"r", "a", "c", "e", "c", "a", "r"};

    @Test
    void test() {
        Instant startTime = Instant.now();

        String[] reversed = ReverseStringArray.reverseStringArray(INPUT);

        Instant endTime = Instant.now();

        System.out.println(reversed.toString());
        Assertions.assertTrue(Arrays.equals(reversed, INPUT));

        System.out.println("ReverseStringArrayTest#test: " + Duration.between(startTime, endTime).toNanos() + " ns");
    }

    @Test
    void testAnswer() {
        Instant startTime = Instant.now();

        String[] reversed = ReverseStringArray.reverseStringArrayAnswer(INPUT);

        Instant endTime = Instant.now();

        System.out.println(reversed.toString());
        Assertions.assertTrue(Arrays.equals(reversed, INPUT));

        System.out.println("ReverseStringArrayTest#testAnswer: " + Duration.between(startTime, endTime).toNanos() + " ns");
    }

}