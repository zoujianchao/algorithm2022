package com.zjc.algorithm.second.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/19 21:36
 * @description :
 */
public class LeetCode151 {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if ("".equals(str[i])) {
                continue;
            }
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
