package com.zjc.algorithm.hundred;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/14 22:04
 * @description : 1. 两数之和
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
//        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
