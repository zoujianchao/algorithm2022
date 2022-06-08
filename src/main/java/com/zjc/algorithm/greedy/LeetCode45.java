package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/8
 * @description : 45. 跳跃游戏 II
 */
public class LeetCode45 {
    public int jump(int[] nums) {
        int curDistance = 0;  //当前覆盖最远距离下标
        int ans = 0; //记录走的最大步数
        int nextDistance = 0; //下一步覆盖最远距离下标
        for (int i = 0; i < nums.length - 1; i++) {
            nextDistance = Math.max(i + nums[i], nextDistance);
            if (i == curDistance) {
                curDistance = nextDistance;
                ans++;
            }
        }
        return ans;
    }
}
