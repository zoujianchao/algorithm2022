package com.zjc.algorithm.hash;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/17
 * @description :
 */
public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] arr = new int[26];
        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    
}
