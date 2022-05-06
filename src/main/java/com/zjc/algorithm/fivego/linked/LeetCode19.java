package com.zjc.algorithm.fivego.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 21:55
 * @description : 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //先搞一个傀儡节点
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //再搞一个快慢指针
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n-- > 0) {
            fast = fast.next;
        }

        ListNode pre = null;
        while (fast != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }

        pre.next = slow.next;
        slow.next = null;

        return dummy.next;

    }
}
