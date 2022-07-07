package com.zjc.algorithm.junior;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/6 23:35
 * @description : 移动零
 */
public class RemoveZero08 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
