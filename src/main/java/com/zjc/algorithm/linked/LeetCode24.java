package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/16
 * @description : 两两交换链表中的节点
 */
public class LeetCode24 {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //获取当前节点的下一个节点
        ListNode next = head.next;
//        ListNode newNode = swapPairs(next.next);
        head.next = swapPairs(next.next);
        //交换
        next.next = head;
//        head.next = newNode;
        return next;
    }
    
    public static void main(String[] args) {
        ListNode n4 = new ListNode(4, null);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        System.out.println(swapPairs(n1));
    }
}
