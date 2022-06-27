package com.zjc.algorithm.dp;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/17
 * @description : 322. 零钱兑换
 */
public class LeetCode322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int max = Integer.MAX_VALUE;
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                if (dp[j - coins[i]] != max) {
                    dp[j] = Math.min(dp[j], dp[j - coins[i]]);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }
}
