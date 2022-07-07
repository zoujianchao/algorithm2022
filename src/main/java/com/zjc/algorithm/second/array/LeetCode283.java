package com.zjc.algorithm.second.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/7 23:12
 * @description :
 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[index++] = 0;
        }
    }
}
