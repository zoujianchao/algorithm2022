package com.zjc.algorithm.fivego.stack;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/7
 * @description : 20. 有效的括号
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            }else if (s.charAt(i) == '[') {
                stack.push(']');
            }else if (s.charAt(i) == '{') {
                stack.push('}');
            }else if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
