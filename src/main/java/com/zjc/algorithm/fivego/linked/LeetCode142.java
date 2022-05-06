package com.zjc.algorithm.fivego.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 21:33
 * @description : 142. 环形链表 II
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow =slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
