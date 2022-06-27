package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/25 22:35
 * @description : 6104. 统计星号
 */
public class LeetCode6104 {
    public int countAsterisks(String s) {
        int count = 0;
        int star = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count % 2 == 0) {
                if (s.charAt(i) == '*') {
                    star++;
                }
            }
            if (s.charAt(i) == '|') {
                count++;
            }
        }
        return star;
    }
}
