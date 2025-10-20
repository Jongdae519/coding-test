package com.omnia.bytbytego.twopointers.largestcontainer;

import java.util.ArrayList;

public class LargestContainer {

    public static int largestContainer(ArrayList<Integer> heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.size() - 1;

        while (left < right) {
            int water = (right - left) * Math.min(heights.get(left), heights.get(right));

            if (water > maxWater) {
                maxWater = water;
            }

            if (heights.get(left) < heights.get(right)) {
                left++;
            } else if (heights.get(left) > heights.get(right)) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxWater;
    }
}
