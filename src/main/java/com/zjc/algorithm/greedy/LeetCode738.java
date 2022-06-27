package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/13
 * @description : 738. 单调递增的数字
 */
public class LeetCode738 {
    public static int monotoneIncreasingDigits(int n) {
       String[] str = (n + "").split("");
       int start = str.length;
        for (int i = str.length - 1; i > 0; i--) {
            if (Integer.parseInt(str[i - 1]) > Integer.parseInt(str[i])) {
                str[i - 1] = Integer.parseInt(str[i - 1]) - 1 + "";
                start = i;
            }
        }
    
        for (int i = start; i < str.length; i++) {
            str[i] = "9";
        }
        return Integer.parseInt(String.join("", str));
    }
    
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(322));
    }
}
