package com.zjc.algorithm.second.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 21:52
 * @description : 55. 跳跃游戏
 */
public class LeetCode55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i + nums[i], cover);
            if (cover >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
