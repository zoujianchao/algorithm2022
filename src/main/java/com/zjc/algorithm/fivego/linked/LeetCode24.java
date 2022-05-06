package com.zjc.algorithm.fivego.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 23:03
 * @description : 两两交换链表中的节点
 */
public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;

        return next;
    }
}
