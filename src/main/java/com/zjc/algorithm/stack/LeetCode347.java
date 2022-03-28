package com.zjc.algorithm.stack;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/21
 * @description : 前 K 个高频元素
 */
public class LeetCode347 {
    public int[] topKFrequent(int[] nums, int k) {
        /*Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(
                new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        return o1[1] - o2[1];
                    }
                });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int n = entry.getValue();
            if (queue.size() == k) {
                if(queue.peek()[1] < n){
                    queue.poll();
                    queue.offer(new int[]{num,n});
                }
            }else {
                queue.offer(new int[]{num, n});
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }
        return res;*/
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        
        for (Integer key : map.keySet()) {
            if (queue.size() < k) {
                queue.add(key);
            }else if (map.get(key) > map.get(queue.peek())) {
                queue.remove();
                queue.add(key);
            }
        }
        int[] res = new int[k];
        int i = 0;
        while (!queue.isEmpty()) {
            res[i++] = queue.remove();
        }
        return res;
    }
}
