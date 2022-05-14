package com.zjc.algorithm.hundred;

import java.util.Scanner;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/15 0:27
 * @description : 5. 最长回文子串
 */
public class LeetCode5 {
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean[] b = new boolean[n];
        String res = "";
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= i; j--) {
                b[j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || b[j - 1]);
                if (b[j] && j - i + 1 > res.length()) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
}
