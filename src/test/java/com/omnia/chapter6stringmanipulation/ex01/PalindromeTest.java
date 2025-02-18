package com.omnia.chapter6stringmanipulation.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void test() {
        String input = "Do geese see God?";

        Assertions.assertEquals(Palindrome.isPalindrome(input), true);
    }
}