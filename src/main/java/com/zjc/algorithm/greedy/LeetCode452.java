package com.zjc.algorithm.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/9 23:09
 * @description : 452. 用最少数量的箭引爆气球
 */
public class LeetCode452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int res = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                res++;
            }else {
                points[i][1] = Math.min(points[i - 1][1], points[i][1]);
            }
        }
        return res;
    }
}
