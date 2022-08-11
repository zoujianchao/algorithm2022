package com.zjc.algorithm.test;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/6 22:35
 * @description :
 */
public class LeetCode6141 {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] ints : items1) {
            map.put(ints[0], ints[1]);
        }

        for (int[] ints : items2) {
            if (map.containsKey(ints[0])) {
                map.put(ints[0], map.get(ints[0]) + ints[1]);
            }else {
                map.put(ints[0], ints[1]);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            res.add(list);
        }
        res.sort(Comparator.comparingInt(o -> o.get(0)));
        return res;
    }
}
