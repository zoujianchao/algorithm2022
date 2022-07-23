package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/17 10:53
 * @description :6164. 数位和相等数对的最大和
 */
public class LeetCode6164 {
    public int maximumSum(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (numSum(nums[i]) == numSum(nums[j])) {
                    max = Math.max(max, nums[i] + nums[j]);
                }
            }
        }
        return max;
    }


    private int numSum(int num) {
        int sum = 0;
        while (num != 0) {
            int a = num % 10;
            num = num / 10;
            sum += a;
        }
        return sum;
    }
}
