package com.zjc.algorithm.fivego.array;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7
 * @description : 209. 长度最小的子数组
 */
public class LeetCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
    
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum-=nums[left++];
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
