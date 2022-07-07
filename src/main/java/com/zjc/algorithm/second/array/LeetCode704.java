package com.zjc.algorithm.second.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/7 22:29
 * @description :
 */
public class LeetCode704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
