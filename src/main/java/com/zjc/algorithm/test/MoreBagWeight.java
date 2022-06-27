package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/17
 * @description : 多重背包
 *              https://github.com/zoujianchao/leetcode-master/blob/master/problems/%E8%83%8C%E5%8C%85%E9%97%AE%E9%A2%98%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80%E5%A4%9A%E9%87%8D%E8%83%8C%E5%8C%85.md
 */
public class MoreBagWeight {
    public static int weightBagProblem(int[] weight, int[] value, int[] nums, int bagWeight) {
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            size+=nums[i];
        }
        int[] weight1 = new int[size];
        int[] value1 = new int[size];
        int k = 0;
        int m = 0;
        
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                weight1[k++] = weight[i];
                value1[m++] = value[i];
                nums[i]--;
            }
        }
    
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < weight1.length; i++) {
            for (int j = bagWeight; j >= weight1[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight1[i]] + value1[i]);
            }
            for (int j = 0; j <= bagWeight; j++) {
                System.out.print(dp[j] + " ");
            }
            System.out.println();
        }
        return dp[bagWeight];
    }
    
    public static void main(String[] args) {
        int[] weight = new int[]{1, 3, 4};
        int[] value = new int[]{15, 20, 30};
        int[] nums = new int[]{2, 3, 2};
        int bagWeight = 10;
        //90
        System.out.println(weightBagProblem(weight, value, nums, bagWeight));
    }
}
