package com.zjc.algorithm.string;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/18
 * @description :
 */
public class LeetCode541 {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        int n = s.length();
    
        for (int i = 0; i < n; i+=2*k) {
            int left = i;
            int right =(i+k-1) < n ? i+k-1 : n-1;
            while (left < right) {
                char c = a[left];
                a[left] = a[right];
                a[right] = c;
                left++;
                right--;
            }
        }
        String ss = new String(a);
        return ss;
        
    }
}
