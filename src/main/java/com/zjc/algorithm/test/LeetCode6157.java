package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/20 23:21
 * @description :
 */
public class LeetCode6157 {
    public static int secondsToRemoveOccurrences(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        if (!s.contains("01")) {
            return count;
        }
        for (; ; ) {
            for (int j = 0; j < chars.length - 1; ) {
                if (chars[j] == '0' && chars[j + 1] == '1') {
                    chars[j] = '1';
                    chars[j + 1] = '0';
                    j += 2;
                } else {
                    j++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(chars);
            count++;
            if (!sb.toString().contains("01")) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(secondsToRemoveOccurrences("001011"));
    }
}
