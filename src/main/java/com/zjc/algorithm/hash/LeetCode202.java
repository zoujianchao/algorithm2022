package com.zjc.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/17
 * @description : 快乐数
 */
public class LeetCode202 {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while (n != 1) {
            n = getSum(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }
    
    public static int getSum(int x) {
        int sum = 0;
        int d = 0;
        while (x > 0){
            d = x%10;
            sum += d*d;
            x = x/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        isHappy(19);
    }
    
}
