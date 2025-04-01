package com.omnia.chapter6stringmanipulation.ex06;

public class LongestPalindromeSubstring {

    int left, maxLen;

    public String longestPalindromeAnswer(String str) {
        int len = str.length();

        if (len < 2) {
            return str;
        }

        for (int i = 0; i < len - 1; i++) {
            extendPalindromeAnswer(str, i, i + 1);
            extendPalindromeAnswer(str, i, i + 2);
        }

        return str.substring(left, left + maxLen);
    }

    public void extendPalindromeAnswer(String str, int firstIndex, int lastIndex) {
        while (firstIndex >= 0 && lastIndex < str.length() && str.charAt(firstIndex) == str.charAt(lastIndex)) {
            firstIndex--;
            lastIndex++;
        }

        if (maxLen < lastIndex - firstIndex - 1) {
            left = firstIndex + 1;
            maxLen = lastIndex - firstIndex - 1;
        }
    }
}
