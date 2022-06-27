package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/14
 * @description : 343. 整数拆分
 */
public class LeetCode343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
