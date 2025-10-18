package com.omnia.bytbytego.pairsum;

import java.util.ArrayList;

public class PairSum {
    public static ArrayList<Integer> pairSumSorted(ArrayList<Integer> nums, int target) {
        // Write your code here
        int left = 0;
        int right = nums.size() - 1;

        ArrayList<Integer> result = new ArrayList<Integer>();

        while (left < right) {
            if (nums.get(left) + nums.get(right) == target) {
                result.add(left);
                result.add(right);
                return result;
            } else if (nums.get(left) + nums.get(right) < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}