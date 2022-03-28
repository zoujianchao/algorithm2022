package com.zjc.algorithm.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/10
 * @description : 删除有序数组中的重复项
 */
public class LeetCode26 {
    public static int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[q] != nums[p]) {
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1};
        removeDuplicates(nums);
    }
}
