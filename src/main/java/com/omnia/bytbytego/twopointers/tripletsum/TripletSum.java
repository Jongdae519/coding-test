package com.omnia.bytbytego.twopointers.tripletsum;

import java.util.ArrayList;
import java.util.Collections;

public class TripletSum {

    public static ArrayList<ArrayList<Integer>> tripletSum(ArrayList<Integer> nums) {
        Collections.sort(nums);

        ArrayList<ArrayList<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            // a + b + c = 0 이므로 a가 0보다 클 때 중지
            if (nums.get(i) > 0) {
                break;
            }
            // a의 중복 방지
            if (i > 0 && nums.get(i) == nums.get(i - 1)) {
                continue;
            }
            ArrayList<ArrayList<Integer>> pairs = pairSumSortedAllPairs(nums, i + 1, -nums.get(i));
            for (ArrayList<Integer> pair : pairs) {
                ArrayList<Integer> triplet = new ArrayList<>();
                triplet.add(nums.get(i));
                triplet.addAll(pair);
                triplets.add(triplet);
            }
        }

        return triplets;
    }

    private static ArrayList<ArrayList<Integer>> pairSumSortedAllPairs(ArrayList<Integer> nums, int left, int target) {
        int right = nums.size() - 1;

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(nums.get(left));
                pair.add(nums.get(right));
                pairs.add(pair);

                left++;

                while (left < right && nums.get(left).equals(nums.get(left - 1))) {
                    left++;
                }
            }
        }

        return pairs;
    }
}
