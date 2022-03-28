package com.zjc.algorithm.stack;

import java.util.LinkedList;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/21
 * @description : 滑动窗口最大值
 */
public class LeetCode239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        //双向队列 ,保存当前窗口最大值的数组位置,保证队列中数组位置的数据从大到小排列
        LinkedList<Integer> queue = new LinkedList<>();
        //结果数组
        int[] result = new int[nums.length - k + 1];
        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            //保证从大到小,如果前面的数据小,则依次弹出,直至满足要求
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            //添加当前值对应的数据下标
            queue.addLast(i);
            //判断当前队列中队首的值是否有效
            if (queue.peek() <= i-k) {
                queue.poll();
            }
            //当窗口长度为k时,保存当前窗口的最大值
            if (i+1 >= k) {
                result[i+1-k] = nums[queue.peek()];
            }
            
        }
        return result;
        
    }
}
