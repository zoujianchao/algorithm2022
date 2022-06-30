package com.zjc.algorithm.greedy;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/30 23:10
 * @description : 674. 最长连续递增序列
 */
public class LeetCode647 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                dp[i + 1] = dp[i] + 1;
            }
            if (dp[i + 1] > res) {
                res = dp[i + 1];
            }
        }
        return res;
    }

    public int findLengthOfLCIS1(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int res = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
            }else {
                count = 1;
            }

            if (count > res) {
                res = count;
            }
        }
        return res;
    }
}
