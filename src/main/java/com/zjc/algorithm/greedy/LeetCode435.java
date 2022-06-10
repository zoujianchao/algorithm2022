package com.zjc.algorithm.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/10
 * @description : 435. 无重叠区间  [[3,4],[2,3],[1,2],[1,3]]
 *                               [[1,2],[2,3],[1,3],[3,4]]
 *
 */
public class LeetCode435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        //正解1 [[1,2],[2,3],[1,3],[3,4]]
//        Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? a[1] - b[1] : b[0] - a[0]);
//        int res = 0;
//        int edge = intervals[0][1];
//        for (int i = 1; i < intervals.length; i++) {
//            if (intervals[i][0] < edge) {
//                res++;
//            }else {
//                edge = intervals[i][1];
//            }
//        }
//        return res;
    
        //解法2:
        //[[1,3],[1,2],[2,3],[3,4]]
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int res = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[i - 1][1]) {
                res++;
            }else {
                 intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            }
        }
        return intervals.length - res;
    }
    
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        list.add(l1);
        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(3);
        list.add(l2);
        List<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(4);
        list.add(l3);
        List<Integer> l4 = new ArrayList<>();
        l4.add(1);
        l4.add(3);
        list.add(l4);
        System.out.println(list);
        Collections.sort(list, (a, b) -> a.get(0) == b.get(0) ? a.get(1) - b.get(1) : b.get(0) - a.get(0));
        System.out.println(list);
        int[][] ints = list.toArray(new int[list.size()][]);
        System.out.println(ints.toString());
    }
}
