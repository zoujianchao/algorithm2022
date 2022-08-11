package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/7 0:05
 * @description :
 */
public class LeetCode6144 {
    public static long minimumReplacement(int[] nums) {
        long count = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                long temp = (int) Math.ceil(nums[i] / (double) nums[i + 1]);
                count += temp - 1;
                nums[i] = (int) Math.floor(nums[i] / (double) temp);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {19, 1};
        System.out.println(minimumReplacement(nums));

        System.out.println(Math.ceil(19.0 / 17));
    }
}
