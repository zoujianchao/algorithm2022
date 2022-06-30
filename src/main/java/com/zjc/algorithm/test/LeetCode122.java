package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/28 23:13
 * @description : 122. 买卖股票的最佳时机 II
 */
public class LeetCode122  {
    //贪心
    public int maxProfit(int[] prices) {
        int res = 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - prices[i - 1]);
            sum+=res;
            res = 0;
        }
        return sum;
    }
    //动态规划
    public int maxProfit1(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][1] = -prices[0];
        dp[0][0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]); //利润,卖出的股票,获得现金prices[i]
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]); //买入的股票, 消费现金prices[i]
        }
        return dp[prices.length - 1][0];
    }
}
