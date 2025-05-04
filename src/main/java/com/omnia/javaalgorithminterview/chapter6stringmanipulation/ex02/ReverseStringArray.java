package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex02;

import java.util.Arrays;

public class ReverseStringArray {

    public static String[] reverseStringArray(String[] strings) {
        return Arrays.stream(strings).toList().reversed().toArray(String[]::new);
    }

    /**
     * Answer
     */
    public static String[] reverseStringArrayAnswer(String[] strings) {
        int start = 0;
        int end = strings.length - 1;

        while (start < end) {
            String temp = strings[start];
            strings[start] = strings[end];
            strings[end] = temp;
            start++;
            end--;
        }

        return strings;
    }
}
