package com.omnia.bytbytego.twopointers.shiftzerostotheend;

import java.util.ArrayList;

public class ShiftZerosToTheEnd {

    public static void shiftZerosToTheEndNaive(ArrayList<Integer> nums) {
        int left = 0;

        for (int right = 0; right < nums.size(); right++) {
            if (nums.get(right) != 0) {
                // 같지 않을 때만 스왑
                if (left != right) {
                    int temp = nums.get(left);
                    nums.set(left, nums.get(right));
                    nums.set(right, temp);
                }
                left++;
            }
        }
    }
}
