package com.zjc.algorithm.test;

import java.util.Objects;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/23 22:51
 * @description : 6129. 全 0 子数组的数目
 */
public class LeetCode6219 {
    public long zeroFilledSubarray(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            if (num == 0) {
                sb.append("0");
            } else {
                sb.append(" ");
            }
        }
        String[] str = sb.toString().split(" ");
        long count = 0;
        for (String s : str) {
            if (Objects.equals(s, "")) {
                continue;
            }
            long[] dp = new long[s.length()];
            dp[0] = 1;
            for (int j = 1; j < s.length(); j++) {
                dp[j] = dp[j - 1] + j + 1;
            }
            count += dp[s.length() - 1];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0 ,0};
        System.out.println(zeroFilledSubarray1(nums));
    }

    public static long zeroFilledSubarray1(int[] nums) {
        long count = 0, i = 0;
        for (int num : nums) {
            count += (i = num == 0 ? i + 1 : 0);
        }
        return count;
    }
}
