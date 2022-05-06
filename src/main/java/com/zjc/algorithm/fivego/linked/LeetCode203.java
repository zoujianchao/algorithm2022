package com.zjc.algorithm.fivego.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 19:08
 * @description : 移除链表元素
 */
public class LeetCode203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        }else {
            return head;
        }

    }

    //非递归
    public ListNode removeElements1(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null){
            return head;
        }

        ListNode prev = head;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }

        return head;
    }
}
