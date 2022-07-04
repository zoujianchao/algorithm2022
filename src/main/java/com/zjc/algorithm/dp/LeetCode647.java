package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/4 23:07
 * @description : 647. 回文子串
 */
public class LeetCode647 {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;
        for (int i = s.length() -1; i >=0 ; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1) {
                        res++;
                        dp[i][j] = true;
                    }else if (dp[i +1][j - 1]){
                        res++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;
    }
}
