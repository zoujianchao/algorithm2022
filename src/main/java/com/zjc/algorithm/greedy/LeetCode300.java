package com.zjc.algorithm.greedy;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/30 22:38
 * @description : 300. 最长递增子序列
 */
public class LeetCode300 {
    public static int lengthOfLIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > res) {
                res = dp[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 2};
        System.out.println(lengthOfLIS(nums));
    }

}
