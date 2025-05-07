package com.omnia.leetcode.topinterview150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            result.add(nums1[i]);
        }

        for (int j = 0; j < n; j++) {
            result.add(nums2[j]);
        }

        Collections.sort(result);

        for (int k = 0; k < result.size(); k++) {
            nums1[k] = result.get(k);
        }
    }
}
