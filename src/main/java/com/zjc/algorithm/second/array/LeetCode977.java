package com.zjc.algorithm.second.array;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/7 23:14
 * @description :
 */
public class LeetCode977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
