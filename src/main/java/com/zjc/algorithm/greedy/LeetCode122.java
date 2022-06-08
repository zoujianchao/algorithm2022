package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/7 22:29
 * @description : 122. 买卖股票的最佳时机 II
 */
public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res+=Math.max(prices[i]-prices[i-1], 0);
        }
        return res;
    }
}
