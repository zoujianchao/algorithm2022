package com.zjc.algorithm.hundred;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/14 23:24
 * @description : 3. 无重复字符的最长子串
 */
public class LeetCode3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (map.containsKey(ch)){
                start = Math.max(map.get(ch) + 1, start);
            }
            max = Math.max(max, end - start + 1);
            map.put(ch, end);
        }
        return max;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(lengthOfLongestSubstring(s));
        System.out.println((int) 3/2);
    }
}
