package com.zjc.algorithm.greedy;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/7
 * @description : 455. 分发饼干
 */
public class LeetCode455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                start++;
            }
        }
        return start;
    }
}
