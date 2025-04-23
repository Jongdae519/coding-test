package com.omnia.chapter7Array.ex08;

import java.util.ArrayDeque;
import java.util.Deque;

public class TrappingRainWater {

    public static int trapAnswer(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax <= rightMax) {
                volume += leftMax - height[left];
                left++;
            } else {
                volume += rightMax - height[right];
                right--;
            }
        }
        return volume;
    }

    public static int trapAnswerWithStack(int[] height) {
        Deque<Integer> stack = new ArrayDeque<>();
        int volume = 0;

        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                Integer top = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int distance = i - stack.peek() - 1;

                int waters = Math.min(height[i], height[stack.peek()]) - height[top];
                volume += distance * waters;
            }

            stack.push(i);
        }

        return volume;
    }
}
