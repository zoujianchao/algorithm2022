package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/18
 * @description : 颠倒字符串中的单词
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >=0; i--) {
            if (str[i].equals("")) {
                continue;
            }
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();
    }
}
