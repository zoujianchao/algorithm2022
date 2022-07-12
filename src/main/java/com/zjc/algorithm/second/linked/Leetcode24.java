package com.zjc.algorithm.second.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/12 23:39
 * @description : 24. 两两交换链表中的节点
 */
public class Leetcode24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = dummyHead;
        while (curr.next != null && curr.next.next != null){
            ListNode tmp = curr.next;
            ListNode tmp1 = curr.next.next.next;

            curr.next = curr.next.next;
            curr.next.next = tmp;
            curr.next.next.next = tmp1;

            curr = curr.next.next;

        }
        return dummyHead.next;
    }
}
