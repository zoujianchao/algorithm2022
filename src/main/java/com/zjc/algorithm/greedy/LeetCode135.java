package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/8 22:03
 * @description : 135. 分发糖果
 */
public class LeetCode135 {
    public int candy(int[] ratings) {
        int[] candyList = new int[ratings.length];
        candyList[0] = 1;
        //从前向后遍历
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candyList[i] = candyList[i - 1] + 1;
            } else {
                candyList[i] = 1;
            }
        }
        //从后向前遍历
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candyList[i] = Math.max(candyList[i], candyList[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int res : candyList) {
            sum+=res;
        }

        return sum;
    }
}
