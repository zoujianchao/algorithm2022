package com.zjc.algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/10 22:41
 * @description : 56. 合并区间 [[1,3],[2,6],[8,10],[15,18]]
 */
public class LeetCode56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        List<int[]> res= new ArrayList<>();
        int start = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > intervals[i - 1][1]){
                res.add(new int[]{start, intervals[i - 1][1]});
                start = intervals[i][0];
            }else {
                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
            }
        }
        res.add(new int[]{start, intervals[intervals.length - 1][1]});
        return res.toArray(new int[res.size()][2]);
    }
}
