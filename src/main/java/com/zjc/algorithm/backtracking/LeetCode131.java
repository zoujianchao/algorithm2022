package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/1
 * @description : 131. 分割回文串 (“回文串”是一个正读和反读都一样的字符串，初始化标志flag=true，比如“level”或者“noon”等等就是回文串)
 */
public class LeetCode131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        backtracking(s, 0, res, list);
        return res;
    }
    
//    public static void main(String[] args) {
//        List<List<String>> res = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();
//        backtracking("aab", 0, res, list);
//        System.out.println(res.toString());
//    }
    
    public static void backtracking(String s, int startIndex, List<List<String>> res, ArrayList<String> list) {
        if (startIndex == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                list.add(str);
            } else {
                continue;
            }
            backtracking(s, i + 1, res, list);
            list.remove(list.size() - 1);
        }
    }
    
    public static Boolean isPalindrome(String str, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
}
