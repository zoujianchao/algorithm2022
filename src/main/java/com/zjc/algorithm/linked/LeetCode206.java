package com.zjc.algorithm.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/14
 * @description : 单链表 反转链表
 *
 * 定义两个指针： pre 和 cur ；pre 在前 cur 在后。
 * 每次让 pre 的 next 指向 cur ，实现一次局部反转
 * 局部反转完成之后，pre 和 cur 同时往前移动一个位置
 * 循环上述过程，直至 pre 到达链表尾部
 *
 */
public class LeetCode206 {
    public ListNode reverseList1(ListNode head) {
        ListNode temp = null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
    
    public ListNode reverseList3(ListNode head) {
        ListNode temp = null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    
    public ListNode reverseList4(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = reverseList4(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
