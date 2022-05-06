package com.zjc.algorithm.fivego.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/6 20:23
 * @description : 206. 反转链表
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
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
}



//    ListNode temp = null;
//    ListNode pre = null;
//    ListNode cur = head;
//
//        while (cur != null) {
//                temp = cur.next;
//                cur.next = pre;
//
//                pre = cur;
//                cur = temp;
//                }
//                return pre;