package com.zjc.algorithm.fivego.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7 0:11
 * @description : 27. 移除元素
 */
public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p++] = nums[i];
            }
        }
        return p;
    }
}
