package com.zjc.algorithm.second.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/25 22:01
 * @description : 135. 分发糖果
 */
public class LeetCode135 {
    public static int candy(int[] ratings) {
        if (ratings.length == 1) {
            return 1;
        }
        int[] res = new int[ratings.length];
        res[0] = 1;
        //从前向后遍历
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                res[i] = res[i - 1] + 1;
            } else {
                res[i] = 1;
            }
        }
        //从后向前遍历
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                res[i] = Math.max(res[i], res[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int re : res) {
            sum += re;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums ={1,3,4,5,2};
        System.out.println(candy(nums));
    }
}
