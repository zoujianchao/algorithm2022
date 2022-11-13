package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/20 22:35
 * @description :
 */
public class LeetCode6156 {
    public static int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < chars.length; i++) {
            if (chars.length - i < k) {
                break;
            }
            int count = 0;
            int total = 0;
            for (int j = i; j < chars.length; j++) {
                if (chars[j] == 'W') {
                    count++;
                }
                total++;
                if (total == k) {
                    min = Math.min(min, count);
                    break;
                }
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }
}
