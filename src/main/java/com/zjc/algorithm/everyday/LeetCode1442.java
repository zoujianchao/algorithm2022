package com.zjc.algorithm.everyday;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/14 22:24
 * @description :
 */
public class LeetCode1442 {
    public int maxScore(String s) {
        int len = s.length();
        int zero = 0;
        int one = 0;
        int max = -1;
        for(int i=0;i<len;i++){
            if(s.charAt(i) == '1'){
                one++;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            if (s.charAt(i) == '0') {
                zero++;
            }else {
                one--;
            }
            max = Math.max(max, zero + one);
        }
        return max;
    }
}
