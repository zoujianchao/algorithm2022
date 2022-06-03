package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/14
 * @description : 移除链表元素
 */
public class LeetCode203 {

    //递归
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements1(head.next, val);
        if (head.val == val) {
            return head.next;
        }else {
            return head;
        }
    }
    
    //非递归
    public ListNode removeElements2(ListNode head, int val) {
        //删除值相同的头结点后，可能新的头结点也值相等，用循环解决
        while (head != null && head.val == val) {
            head = head.next;
        }
        
        if (head == null) {
            return head;
        }
        
        ListNode prev = head;
        //确保当前结点后还有结点
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }
    
    public ListNode removeElements3(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            head.next = removeElements3(head.next, val);
            if (head.val == val) {
                return head.next;
            }else {
                return head;
            }
    }
    
    public ListNode removeElements4(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        while (pre != null) {
            if (pre.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return head;
    }

    public ListNode removeElements5(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        head.next = removeElements5(head.next, val);
        if (head.val == val){
            return head.next;
        }else {
            return head;
        }
    }

    public ListNode removeElements6(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) {
            return head;
        }
        ListNode pre = head;
        while (pre.next != null){
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return head;
    }
}
