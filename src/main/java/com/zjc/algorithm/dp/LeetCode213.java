package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/17
 * @description : 213. 打家劫舍 II
 */
public class LeetCode213 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res1 = robRange(nums, 1, nums.length - 1);
        int res2 = robRange(nums, 0, nums.length - 2);
        return Math.max(res1, res2);
    }
    
    private int robRange(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[end];
    }
}
