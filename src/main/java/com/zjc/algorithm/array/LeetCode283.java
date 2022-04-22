package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/11
 * @description : 移动零
 */
public class LeetCode283 {
    //    public void moveZeroes(int[] nums) {
//        int j = 0;
//        for (int i = 0; i < nums.length ; i++) {
//            if (nums[i] != 0) {
//                nums[j++] = nums[i];
//            }
//        }
//
//        for (int i = j; i < nums.length; i++) {
//            nums[i] = 0;
//        }
//    }
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
