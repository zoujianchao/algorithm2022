package com.zjc.algorithm.monotonous;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/4 23:56
 * @description : 739. 每日温度
 */
public class LeetCode739 {
    //暴力
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length ; j++) {
                if (temperatures[j] > temperatures[i]) {
                    arr[i] = j - i;
                    break;
                }else {
                    arr[i] = 0;
                }
            }
        }
        arr[temperatures.length - 1] = 0;
        return arr;
    }
    //单调栈
    public int[] dailyTemperatures1(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] <= temperatures[stack.peek()]) {
                stack.push(i);
            }else {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    result[stack.peek()] = i - stack.pop();
                }
                stack.push(i);
            }
        }
        return result;
    }
}
