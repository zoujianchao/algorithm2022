package com.zjc.algorithm.test;

import javax.jnlp.ClipboardService;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/3 21:55
 * @description :
 */
public class MyLinkedList {
    int size;
    ListNode head;
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
//        ListNode node = new ListNode(val);
//        node.next = head;
//        size++;
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
//        ListNode curr = head;
//        int index = 0;
//        while (index == size) {
//            curr = curr.next;
//        }
//        ListNode node = new ListNode(val);
//        node.next = curr.next;
//        curr.next = node;
//        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode node = new ListNode(val);
        node.next = pre.next;
        pre.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size) {
            return;
        }
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
}
