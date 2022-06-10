package com.zjc.algorithm.greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/10 22:31
 * @description : 763. 划分字母区间
 */
public class LeetCode763 {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();

        int[] edge = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < chars.length; i++) {
            right = Math.max(edge[chars[i] - 'a'], right);
            if (i == right) {
                res.add(right - left + 1);
                left = i + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
