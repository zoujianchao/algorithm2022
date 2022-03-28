package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/18
 * @description : 反转字符串
 */
public class LeetCode344 {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length-1; i < j ; i++, j--) {
            char a = s[i];
            s[i] = s[j];
            s[j] = a;
        }
    }
}
