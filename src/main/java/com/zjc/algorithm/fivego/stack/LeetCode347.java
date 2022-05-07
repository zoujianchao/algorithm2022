package com.zjc.algorithm.fivego.stack;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7
 * @description :
 */
public class LeetCode347 {
    public int[] topKFrequent0(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int num: nums) {
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
       PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
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
    
    public int[] topKFrequent(int[] nums, int k) {
        
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
