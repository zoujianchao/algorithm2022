package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/7
 * @description : 376. 摆动序列
 */
public class LeetCode376 {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        //当前差值
        int currDiff = 0;
        //上一个差值
        int preDiff = 0;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            //得到当前差值
            currDiff = nums[i] - nums[i - 1];
            //如果当前差值和上一个差值为一正一负
            //等于0的情况表示初始时的preDiff
            if ((currDiff > 0 && preDiff <= 0) || (currDiff < 0 && preDiff >= 0)) {
                count++;
                preDiff = currDiff;
            }
        }
        return count;
    }
}
