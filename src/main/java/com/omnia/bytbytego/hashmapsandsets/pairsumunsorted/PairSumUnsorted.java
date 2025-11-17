package com.omnia.bytbytego.hashmapsandsets.pairsumunsorted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PairSumUnsorted {

    public static ArrayList<Integer> pairSumUnsortedTwoPass(ArrayList<Integer> nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            numMap.put(nums.get(i), i);
        }

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(i);
                result.add(numMap.get(complement));
                return result;
            }
        }

        return new ArrayList<>();
    }
}
