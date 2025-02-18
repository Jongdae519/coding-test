package com.omnia.chapter6stringmanipulation.ex01;

public class Palindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String input) {
        String strOnly = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String strOnlyReverse = new StringBuilder(strOnly).reverse().toString();

        return strOnly.equals(strOnlyReverse);
    }

    /** Answer */
    public static boolean isPalindromeAnswer(String input) {
        int start = 0;
        int end = input.length() -1;

        while (start < end) {
            if (!Character.isLetterOrDigit(input.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(input.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(input.charAt(start)) == Character.toLowerCase(input.charAt(end))) {
                    return false;
                }
                start++;
                end--;
            }
        }

        return true;
    }
}
