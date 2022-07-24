package com.zjc.algorithm.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 0:17
 * @description : 6131. 不可能得到的最短骰子序列
 */
public class LeetCode6131 {
    public static int shortestSequence(int[] rolls, int k) {
        int min = 1;
        Set<Integer> set = new HashSet<>();
        for (int roll : rolls) {
            set.add(roll);
            if (set.size() == k) {
                set.clear();
                min++;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] rolls = {1,1,2,2};
        System.out.println(shortestSequence(rolls, 2));
    }
}
