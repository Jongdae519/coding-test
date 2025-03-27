package com.omnia.chapter6stringmanipulation.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

class ValidPalindromeTest {

    private static final String INPUT = "Do geese see God?";

    @Test
    void test() {
        Instant startTime = Instant.now();

        boolean result = ValidPalindrome.isPalindrome(INPUT);

        Instant endTime = Instant.now();

        Assertions.assertEquals(result, true);

        System.out.println("ValidPalindromeTest#test: " + Duration.between(startTime, endTime).toNanos() + " ns");
    }

    @Test
    void testAnswer() {
        Instant startTime = Instant.now();

        boolean result = ValidPalindrome.isPalindromeAnswer(INPUT);

        Instant endTime = Instant.now();

        Assertions.assertEquals(result, true);

        System.out.println("ValidPalindromeTest#testAnswer: " + Duration.between(startTime, endTime).toNanos() + " ns");

    }
}