package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/28 21:57
 * @description : 121. 买卖股票的最佳时机
 */
public class LeetCode121 {
    //贪心算法
    public int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            low = Math.min(low, prices[i - 1]);
            res = Math.max(res, prices[i] - low);
        }
        return res;
    }

    //动态规划
    public int maxProfit1(int[] prices) {
        int[] dp = new int[2];
        dp[0] = -prices[0];
        for (int i = 1; i <= prices.length; i++) {
            dp[0] = Math.max(dp[0], -prices[i - 1]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i - 1]);
        }
        return dp[1];
    }
}
