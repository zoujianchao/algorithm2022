package com.zjc.algorithm.second.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/19 21:55
 * @description : 剑指 Offer 58 - II. 左旋转字符串
 */
public class LeetCodeOffer58Two {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
