package com.omnia.javaalgorithminterview.chapter6stringmanipulation.ex04;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {

    public static String mostCommonWordAnswer(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(List.of(banned)); // null 포함 시 List.of 대신 Arrays.asList 사용
        Map<String, Integer> countMap = new HashMap<>();

        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        return Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
