package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/18
 * @description :
 */
public class LeetCode459 {
    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
    
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ab"));
    }
}
