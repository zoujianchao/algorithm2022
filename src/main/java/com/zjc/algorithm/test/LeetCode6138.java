package com.zjc.algorithm.test;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/7 18:29
 * @description : 6138. 最长理想子序列
 */
public class LeetCode6138 {
    public int longestIdealString(String s, int k) {
        int[] dp = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            for (int j = Math.max(c - k, 0); j <= Math.min(c + k, 25); j++) {
                dp[c] = Math.max(dp[c], dp[j]);
            }
            dp[c]++;
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
