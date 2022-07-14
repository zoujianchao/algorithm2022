package com.zjc.algorithm.second.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/14 22:39
 * @description : 19. 删除链表的倒数第 N 个结点
 */
public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;

        while (n-- > 0) {
            fast = fast.next;
        }
        fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next =slow.next.next;
        return dummyNode.next;
    }
}
