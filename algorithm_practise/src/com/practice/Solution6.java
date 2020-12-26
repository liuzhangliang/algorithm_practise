package com.practice;


//
//反转一个单链表。
//
//        示例:
//
//        输入: 1->2->3->4->5->NULL
//        输出: 5->4->3->2->1->NULL
//        进阶:
//        你可以迭代或递归地反转链表。你能否用两种方法解决这道题？


import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution6 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(node1);
        Solution6 s = new Solution6();
        System.out.println(s.reverseList2(node1));
    }

    //递归
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }
        //返回首部结点
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    //非递归
    public ListNode reverseList2(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }


        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }

        ListNode first = list.get(list.size() - 1);
        ListNode node = first;

        for (int i = list.size() - 2; i > -1; i--) {
            node.next = list.get(i);
            node = list.get(i);
        }
        list.get(0).next = null;
        return first;
    }

}
