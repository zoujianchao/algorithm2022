package com.zjc.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/17
 * @description :
 */
public class LeetCode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
    
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        
        for (int num : nums1) {
            s1.add(num);
        }
        
        for (int num : nums2) {
            if (s1.contains(num)) {
                s2.add(num);
            }
        }
        
        int[] arr = new int[s2.size()];
        int index = 0;
        for (int val : s2) {
            arr[index++] = val;
        }
        
        return arr;
    }
}
