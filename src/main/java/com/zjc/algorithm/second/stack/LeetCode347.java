package com.zjc.algorithm.second.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/21 22:13
 * @description : 347. 前 K 个高频元素
 */
public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());

        queue.addAll(map.entrySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.remove().getKey();
        }
        return res;
    }
}
