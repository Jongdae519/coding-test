package com.omnia.bytbytego.twopointers.nextlexicographicalsequence;

public class NextLexicographicalSequence {

    public static String nextLexicographicalSequence(String s) {
        char[] letters = s.toCharArray();

        int pivot = letters.length - 2;

        while (pivot >= 0 && letters[pivot] >= letters[pivot + 1]) {
            pivot--;
        }

        if (pivot == -1) {
            reverse(letters, 0, letters.length - 1);
            return new String(letters);
        }

        int rightMostSuccessor = letters.length - 1;
        while (letters[rightMostSuccessor] <= letters[pivot]) {
            rightMostSuccessor--;
        }

        char temp = letters[pivot];
        letters[pivot] = letters[rightMostSuccessor];
        letters[rightMostSuccessor] = temp;

        reverse(letters, pivot + 1, letters.length - 1);
        return new String(letters);
    }

    private static void reverse(char[] array, int left, int right) {
        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
