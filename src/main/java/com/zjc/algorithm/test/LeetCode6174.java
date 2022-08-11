package com.zjc.algorithm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/6 23:31
 * @description :
 */
public class LeetCode6174 {
    public long taskSchedulerII(int[] tasks, int space) {
        long day = 0;
        Map<Integer, Long> map = new HashMap<>();
        for (int task : tasks) {
            if (map.containsKey(task)) {
                if (day - map.get(task) < space) {
                    day = map.get(task) + space;
                }
                map.put(task, day);
            }
            day++;
            map.put(task, day);
        }
        return day;
    }
}
