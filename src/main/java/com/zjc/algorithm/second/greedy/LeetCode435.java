package com.zjc.algorithm.second.greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/26 23:05
 * @description :435. 无重叠区间
 */
public class LeetCode435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int edge = Integer.MIN_VALUE;
        for (int i = 0; i < intervals.length; i++) {
            if (edge <= intervals[i][0]) {
                edge = intervals[i][1];
            }else {
                count++;
            }
        }
        return count;
    }

}
