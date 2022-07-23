package com.zjc.algorithm.test;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/17 10:44
 * @description : 6120. 数组能形成多少数对
 */
public class LeetCode6120 {
    public int[] numberOfPairs(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ) {
            if (nums[i] == nums[i - 1]) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return new int[]{count, nums.length - 2 * count};
    }
}
