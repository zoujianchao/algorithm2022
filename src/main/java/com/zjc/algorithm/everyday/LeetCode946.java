package com.zjc.algorithm.everyday;

import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/31 21:56
 * @description :
 */
public class LeetCode946 {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int k : pushed) {
            stack.push(k);
            while (!stack.isEmpty()) {
                if (stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                } else {
                    break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        System.out.println(validateStackSequences(pushed, popped));
    }
}
