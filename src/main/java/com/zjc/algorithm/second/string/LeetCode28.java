package com.zjc.algorithm.second.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/19 22:09
 * @description : 28. 实现 strStr()
 */
public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int n = needle.length();
        for (int i = 0; i < haystack.length() - n + 1; i++) {
            if (haystack.substring(i, n + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
