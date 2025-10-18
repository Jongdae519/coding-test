package com.omnia.bytbytego.pairsum;

import java.util.ArrayList;

public class PairSum {
    public static ArrayList<Integer> pairSumSorted(ArrayList<Integer> nums, int target) {
        int left = 0;
        int right = nums.size() - 1;

        ArrayList<Integer> result = new ArrayList<>();

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                result.add(left);
                result.add(right);
                return result;
            }
        }
        return result;
    }
}