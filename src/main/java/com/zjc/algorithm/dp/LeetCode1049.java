package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/15
 * @description : 1049. 最后一块石头的重量 II
 */
public class LeetCode1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum+=stones[i];
        }
        
        int target = sum / 2;
        int[] dp = new int[target + 1];
    
        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        
        return sum - dp[target] - dp[target];
    }
}
