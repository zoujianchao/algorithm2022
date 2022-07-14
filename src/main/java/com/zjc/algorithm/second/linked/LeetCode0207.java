package com.zjc.algorithm.second.linked;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/14 23:01
 * @description : 面试题 02.07. 链表相交
 */
public class LeetCode0207 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null) {
            lenA++;
            currA = currA.next;
        }
        while (currB != null) {
            lenB++;
            currB = currB.next;
        }
        currA = headA;
        currB = headB;
        if (lenB > lenA) {
            int tmp = lenA;
            lenA = lenB;
            lenB = tmp;

            ListNode tmpNode = currA;
            currA = currB;
            currB = tmpNode;
        }

        int gap = lenA - lenB;
        while (gap-- > 0) {
            currA = currA.next;
        }

        while (currA != null) {
            if (currA == currB) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }
}
