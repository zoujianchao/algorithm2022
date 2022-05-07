package com.zjc.algorithm.fivego.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 23:58
 * @description : 删除有序数组中的重复项
 */
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        int p = 0;
        int q = 1;
        while (q < nums.length) {
            if (nums[q] != nums[p]) {
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
