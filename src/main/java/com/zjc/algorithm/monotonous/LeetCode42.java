package com.zjc.algorithm.monotonous;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/5 23:47
 * @description : 42. 接雨水
 */
public class LeetCode42 {
    //双指针
    public int trap0(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            if (i == 0 || i == height.length - 1) {
                continue;
            }
            int rHeight = height[i];
            int lHeight = height[i];
            for (int r = i + 1; r < height.length; r++) {
                if (height[r] > rHeight) {
                    rHeight = height[r];
                }
            }

            for (int l = i - 1; l >= 0; l--) {
                if (height[l] > lHeight) {
                    lHeight = height[l];
                }
            }
            int h = Math.min(lHeight, rHeight) - height[i];
            if (h > 0) {
                sum+=h;
            }
        }
        return sum;
    }

    //单调栈
    public int trap1(int[] height) {
        if (height.length <= 2) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int sum = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] < height[stack.peek()]) {
                stack.push(i);
            }else if (height[i] == height[stack.peek()]) {
                stack.pop();
                stack.push(i);
            }else {
                while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                    int mid = stack.pop();
                    if (!stack.isEmpty()) {
                        int h = Math.min(height[stack.peek()], height[i]) - height[mid];
                        int w = i - stack.peek() - 1;
                        sum+=h*w;
                    }
                }
                stack.push(i);
            }
        }
        return sum;
    }
}
