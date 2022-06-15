package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/14
 * @description : 7. 整数反转
 */
public class LeetCode7 {
    public int reverse(int x) {
        int y = 0;
        while (x != 0) {
            if (y > 214748364 || y < -214748364) {
                return 0;
            }
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }
    
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "1";
        s[1] = "2";
        s[2] = "3";
        System.out.println(String.join("", s));
    }
}
