package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/18
 * @description :
 */
public class LeetCodeJianZhi58Two {
    public String reverseLeftWords(String s, int n) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
    
        for (int i = 0; i < s.length(); i++) {
            if (i < n) {
                s1.append(s.charAt(i));
            }else {
                s2.append(s.charAt(i));
            }
        }
        return s2.toString() + s1.toString();
        
    }
}
