package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/15
 * @description : 416. 分割等和子集
 */
public class LeetCode417 {
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        
        if (sum % 2 == 1) {
            return false;
        }
        
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        
        if (dp[target] == target) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,5,11,5};
        System.out.println(canPartition(nums));
    }
}
