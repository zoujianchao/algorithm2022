package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/31
 * @description : 17. 电话号码的字母组合
 */
public class LeetCode17 {
    
    public static void backtracking(List<String> res, StringBuilder sb, String digits, String[] numString, int num) {
        if (num == digits.length()) {
            res.add(sb.toString());
            return;
        }
        
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            backtracking(res, sb, digits, numString, num + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtracking(res, sb, "23", numString, 0);
    }
    
    
    
//    List<String> res = new ArrayList<>();
//    StringBuilder sb = new StringBuilder();
//
//    public List<String> letterCombinations(String digits) {
//        if (digits == null || digits.length() == 0) {
//            return res;
//        }
//        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        backtracking(digits, numString, 0);
//        return res;
//    }
//
//    public void backtracking(String digits, String[] numString, int num) {
//        if (num == digits.length()) {
//            res.add(sb.toString());
//            return;
//        }
//
//        String str = numString[digits.charAt(num) - '0'];
//        for (int i = 0; i < str.length(); i++) {
//            sb.append(str.charAt(i));
//            backtracking(digits, numString, num + 1);
//            sb.deleteCharAt(sb.length() - 1);
//        }
//    }
}
