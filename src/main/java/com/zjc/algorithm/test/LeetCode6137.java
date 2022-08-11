package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/7 17:05
 * @description : 6137. 检查数组是否存在有效划分
 */
public class LeetCode6137 {
    public boolean validPartition(int[] nums) {
        int len = nums.length;
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 2; i <= len; i++) {
            int num = nums[i - 1];
            if (nums[i - 2] == num) {
                dp[i] = dp[i - 2];
            }
            if (i >= 3 && nums[i - 3] == nums[i - 2] && nums[i - 2] == num) {
                dp[i] = dp[i] || dp[i - 3];
            }
            if (i >= 3 && nums[i - 2] == nums[i - 3] + 1 && num == nums[i - 2] + 1) {
                dp[i] = dp[i] || dp[i - 3];
            }
        }
        return dp[len];
    }
}
