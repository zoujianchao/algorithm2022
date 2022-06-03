package com.zjc.algorithm.test;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/3 22:31
 * @description :
 */
public class LRUSet {

    public int getMin(int[] arr, int k) {
        if (k >= arr.length) {
            return 0;
        }

        int index = 0;
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.size() < k) {
                set.add(arr[i]);
            }else if (set.contains(arr[i])) {
                continue;
            } else {
                Integer first = set.stream().findFirst().orElse(0);
                set.remove(first);
                set.add(arr[i]);
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(new LRUSet().getMin(new int[]{100, 200, 100, 200}, 1));
        System.out.println(new LRUSet().getMin(new int[]{1,2,3,1,2,3}, 2));
        System.out.println(new LRUSet().getMin(new int[]{1,2,3,1,3,2,3}, 1));
        System.out.println(new LRUSet().getMin(new int[]{1,2,3,1,3,2,3}, 2));
        System.out.println(new LRUSet().getMin(new int[]{100, 200, 100, 200}, 2));
        System.out.println(new LRUSet().getMin(new int[]{1,2,3,1,2,3}, 1));
        System.out.println(new LRUSet().getMin(new int[]{1,2,3,1,2,3}, 3));
        System.out.println(new LRUSet().getMin(new int[]{1,2,3,1,2,3}, 4));
        System.out.println(new LRUSet().getMin(new int[]{1,1,1,1,1,1,2,2,2,2,2,2,2,2}, 1));
    }
}
