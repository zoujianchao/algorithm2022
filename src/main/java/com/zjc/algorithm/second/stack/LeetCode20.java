package com.zjc.algorithm.second.stack;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/20 22:17
 * @description : 20. 有效的括号
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(')');
            } else if (chars[i] == '[') {
                stack.push(']');
            } else if (chars[i] == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.peek() != chars[i]) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
