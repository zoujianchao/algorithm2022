package com.zjc.algorithm.fivego.hash;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7
 * @description : 383. 赎金信
 */
public class LeetCode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] arr = new int[26];
        for (char m : magazine.toCharArray()) {
            arr[m - 'a']++;
        }
        
        for (char r : ransomNote.toCharArray()) {
            arr[r - 'a']--;
            if (arr[r - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
