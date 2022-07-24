package com.zjc.algorithm.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/24 10:31
 * @description :6124. 第一个出现两次的字母
 */
public class LeetCode6124 {
    public char repeatedCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                return chars[i];
            }
            map.put(chars[i], i);
        }
        return ' ';
    }
}
