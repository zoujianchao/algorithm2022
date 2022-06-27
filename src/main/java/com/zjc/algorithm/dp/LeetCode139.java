package com.zjc.algorithm.dp;

import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/17
 * @description : 139. 单词拆分
 */
public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j, i)) && dp[j]) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
}
