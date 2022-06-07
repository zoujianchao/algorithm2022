package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/7
 * @description : 53. 最大子数组和
 */
public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int count = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i];
            maxVal = Math.max(maxVal, count);
            if (count < 0) {
                count = 0;
            }
        }
        return maxVal;
    }
}
