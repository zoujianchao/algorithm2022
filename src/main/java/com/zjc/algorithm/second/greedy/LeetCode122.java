package com.zjc.algorithm.second.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 21:41
 * @description : 122. 买卖股票的最佳时机 II
 */
public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i] - prices[i - 1];
            if (price > 0) {
                sum+=price;
            }
        }
        return sum;
    }

}
