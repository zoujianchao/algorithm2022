package com.zjc.algorithm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/6 23:02
 * @description :
 */
public class LeetCode6142 {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long sum = n * (n - 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum -= map.getOrDefault(nums[i] - i, 0);
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i, 0) + 1);
        }
        return sum;
    }
}
