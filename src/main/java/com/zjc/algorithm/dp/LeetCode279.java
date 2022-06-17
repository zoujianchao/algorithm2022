package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/17
 * @description : 279. 完全平方数
 */
public class LeetCode279 {
    public int numSquares(int n) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        for (int i = 1; i <dp.length ; i++) {
            dp[i] = max;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
