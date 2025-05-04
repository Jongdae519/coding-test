package com.omnia.javaalgorithminterview.chapter7Array.ex07;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        List<ElementWithIndex> elements = IntStream.range(0, nums.length)
                .mapToObj(i -> new ElementWithIndex(nums[i], i))
                .collect(Collectors.toList());

        elements.sort(Comparator.comparingInt(ElementWithIndex::value));

        while (left < right) {
            if (elements.get(left).value() + elements.get(right).value() < target) {
                left++;
            } else if (elements.get(left).value() + elements.get(right).value() > target) {
                right--;
            } else {
                return new int[]{elements.get(left).index(), elements.get(right).index()};
            }
        }
        return null;
    }

    public static int[] twoSumAnswer(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

record ElementWithIndex(int value, int index) {
}
