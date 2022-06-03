package com.zjc.algorithm.fivego.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7
 * @description : 239. 滑动窗口最大值
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for (int j = 0, i = 1 - k; j < nums.length; i++, j++) {
            // 删除 deque 中对应的 nums[i-1]
            if (i > 0 && deque.peekFirst() == nums[i - 1])
                deque.removeFirst();
            // 保持 deque 递减
            while (!deque.isEmpty() && deque.peekLast() < nums[j])
                deque.removeLast();
            deque.addLast(nums[j]);
            // 记录窗口最大值
            if (i >= 0)
                res[i] = deque.peekFirst();
        }

        return res;
    }

    public int[] maxSlidingWindow0(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }

        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];

        for (int i = 0, j = 1 - k; i < nums.length; i++, j++) {
            if (j > 0 && deque.peekFirst() == nums[j - 1]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            if (j >= 0) {
                res[j] = deque.peekFirst();
            }
        }

        return res;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int j = 0, i = 1 - k; j < nums.length; j++, i++) {
            if (i > 0 && deque.peekFirst() == nums[i - 1]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.peekLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            if (i >= 0) {
                res[i] = deque.peekFirst();
            }
        }
        return res;
    }
}
