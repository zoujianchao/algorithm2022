package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/10
 * @description : 移除给定的数组中的元素
 */
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                nums[slowIndex++] = nums[i];
            }
        }
        return slowIndex;
    }
}
