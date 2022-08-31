package com.zjc.algorithm.everyday;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/29 22:02
 * @description :
 */
public class LeetCode1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0, j = 0, k = n; i < nums.length; i++) {
            if (i % 2 == 0) {
                arr[i] = nums[j];
                j++;
            } else {
                arr[i] = nums[k];
                k++;
            }
        }
        return arr;
    }
}
