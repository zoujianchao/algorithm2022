package com.zjc.algorithm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/21 11:03
 * @description :
 */
public class LeetCode6166 {
    public static String largestPalindromic(String num) {
        if (num.replaceAll("0", "").length() < 1) {
            return "0";
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            map.put((int) num.charAt(i) - '0', map.getOrDefault((int) num.charAt(i) - '0', 0) + 1);
        }
        StringBuilder sbStart = new StringBuilder();
        StringBuilder sbEnd = new StringBuilder();
        StringBuilder sbMid = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (map.containsKey(i) && map.get(i) % 2 == 1) {
                sbMid.append(i);
            }
            if (map.containsKey(i) && map.get(i) > 1) {
                for (int j = 0; j < map.get(i) / 2; j++) {
                    sbStart.append(i);
                    sbEnd.append(i);
                }
            }
        }
        String str;
        if (sbMid.length() != 0) {
            str = sbStart.toString() + sbMid.toString().charAt(0) + sbEnd.reverse();
        } else {
            str = sbStart.toString() + sbEnd.reverse();
        }
        if (str.replaceAll("0", "").length() > 1) {
            return str;
        } else {
            return str.replaceAll("0", "");
        }
    }

    public static void main(String[] args) {
        System.out.println(largestPalindromic("00009"));
    }
}
