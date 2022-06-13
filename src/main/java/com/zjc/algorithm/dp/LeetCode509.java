package com.zjc.algorithm.dp;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/13
 * @description : 509. 斐波那契数
 */
public class LeetCode509 {
//    public int fib(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        int f1 = 0;
//        int f2 = 1;
//        int f3 = 0;
//        while (n > 1) {
//            f3 = f1 + f2;
//            f1 = f2;
//            f2 = f3;
//            n--;
//        }
//
//        return f3;
//    }
    
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
