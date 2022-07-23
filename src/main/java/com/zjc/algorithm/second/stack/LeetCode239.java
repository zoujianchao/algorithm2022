package com.zjc.algorithm.second.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/20 23:01
 * @description : 239. 滑动窗口最大值
 */
public class LeetCode239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0, j = 1 - k; i < nums.length; i++, j++) {
            if (j > 0 && deque.peekFirst() == nums[j - 1]) {
                deque.removeFirst();
            }

            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            if (j >= 0) {
                res[j] = deque.peekFirst();
            }
        }
        return res;
    }

    public static int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0, j = 1 - k; i < nums.length; i++, j++) {
            if (j > 0 && deque.peekFirst() == nums[j - 1]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            if (j >= 0) {
                res[j] = deque.peekFirst();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, -3, 3, 6, 7};
        maxSlidingWindow(nums, 3);
    }
}
