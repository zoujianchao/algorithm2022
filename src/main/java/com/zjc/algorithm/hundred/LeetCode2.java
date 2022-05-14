package com.zjc.algorithm.hundred;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/14 22:54
 * @description : 2. 两数相加
 */
public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //搞个辅助节点
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            pre.next = new ListNode(sum % 10);
            carry = sum / 10;

            pre = pre.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            pre.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
