package com.zjc.algorithm.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/21
 * @description : 用栈实现队列
 */
public class LeetCode232 {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    
    public LeetCode232() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        inPut();
        return outStack.pop();
    }
    
    public int peek() {
        inPut();
        return outStack.peek();
    }
    
    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }
    
    private void inPut() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
    
}
