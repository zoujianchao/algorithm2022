package com.zjc.algorithm.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/21
 * @description : 用队列实现栈
 */
public class LeetCode225 {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    
    public LeetCode225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
    }
    
    public int pop() {
        return queue1.poll();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
