package com.zjc.algorithm.everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/4 22:34
 * @description :
 */
public class LeetCode1403 {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        int max = 0;
        for (int num : nums) {
            sum+=num;
        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >=0; i--) {
            sum-=nums[i];
            max+=nums[i];
            list.add(nums[i]);
            if (max > sum) {
                break;
            }
        }
        return list;
    }
}
