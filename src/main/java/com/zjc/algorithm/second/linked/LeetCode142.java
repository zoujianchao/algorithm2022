package com.zjc.algorithm.second.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/14 23:38
 * @description : 142. 环形链表 II
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
