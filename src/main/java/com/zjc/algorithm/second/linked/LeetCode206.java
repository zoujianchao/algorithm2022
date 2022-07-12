package com.zjc.algorithm.second.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/12 23:28
 * @description : 206. 反转链表
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }
}
