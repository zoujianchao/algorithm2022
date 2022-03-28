package com.zjc.algorithm.stack;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/21
 * @description :
 */
public class LeetCode1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            }else {
                stack.pop();
            }
        }
        
        String res = "";
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(res);
        return sb.reverse().toString();
    }
}
