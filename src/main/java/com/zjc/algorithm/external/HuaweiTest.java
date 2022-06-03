package com.zjc.algorithm.external;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/18 11:37
 * @description :
 */
public class HuaweiTest {
    public static boolean isValid(String s) {
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
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
        System.out.println(isValid("()[]{}"));
    }
}
