package com.zjc.algorithm.second.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/7 22:52
 * @description : 27. 移除元素
 */
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
