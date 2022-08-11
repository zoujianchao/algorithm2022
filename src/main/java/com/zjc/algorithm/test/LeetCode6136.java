package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/7 10:47
 * @description :
 */
public class LeetCode6136 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j +1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
