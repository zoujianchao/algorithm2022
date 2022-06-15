package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/15
 * @description : 背包问题01
 * https://github.com/zoujianchao/leetcode-master/blob/master/problems/%E8%83%8C%E5%8C%85%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%8001%E8%83%8C%E5%8C%85-2.md
 */
public class BigWeight01 {
    
    /**
     * @param weight    物品重量
     * @param value     物品价值
     * @param bagWeight 背包总容量
     */
    public static int weightBagProblem(int[] weight, int[] value, int bagWeight) {
        //定义dp数组：dp[j]表示背包容量为j时，能获得的最大价值
        int[] dp = new int[bagWeight + 1];
        //遍历顺序：先遍历物品，再遍历背包容量
        for (int i = 0; i < weight.length; i++) {
            for (int j = bagWeight; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        return dp[bagWeight];
    }
    
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagWight = 4;
        int bagProblem = weightBagProblem(weight, value, bagWight);
        System.out.println(bagProblem);
    }
}
