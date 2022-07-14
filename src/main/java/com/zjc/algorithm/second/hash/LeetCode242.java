package com.zjc.algorithm.second.hash;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/14 23:44
 * @description : 242. 有效的字母异位词
 */
public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        if (String.valueOf(charS).equals(String.valueOf(charT))) {
            return true;
        }

        return false;
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] c = new char[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            c[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (c[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
