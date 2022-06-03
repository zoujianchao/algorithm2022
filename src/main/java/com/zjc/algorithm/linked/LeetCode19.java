package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/16
 * @description :  删除链表的倒数第 N 个结点
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while (n-- > 0) {
            fast = fast.next;
        }
        //记住待删除节点 slow的上一个节点
        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        //上一节点的next指针绕过 待删除节点slow 直接指向slow的下一节点
        pre.next = slow.next;
        //释放 待删除节点slow 的next指针
        slow.next = null;
        return dummy.next;
    }

    public ListNode removeNthFromEnd0(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while (n-- > 0) {
            fast = fast.next;
        }
        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            slow =slow.next;
            fast = fast.next;
        }

        pre.next = slow.next;
        slow.next = null;

        return dummy.next;

    }
}
