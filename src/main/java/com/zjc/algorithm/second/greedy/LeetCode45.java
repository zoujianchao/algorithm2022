package com.zjc.algorithm.second.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 22:39
 * @description : 45. 跳跃游戏 II
 */
public class LeetCode45 {
    public static int jump(int[] nums) {
        int curDistance = 0;
        int ans = 0;
        int nextDistance = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextDistance = Math.max(i + nums[i], nextDistance);
            if (i == curDistance) {
                curDistance = nextDistance;
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 7, 1, 1, 1, 1, 1};
        System.out.println(jump(nums));
    }
}
