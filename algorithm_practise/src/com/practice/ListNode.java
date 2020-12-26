package com.practice;


/**
 * @ClassName ListNode
 * @Description: TODO
 * @Author liuzhangliang
 * @Date 2020/12/25
 * @Version V1.0
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        if (this.next != null) {
            return this.val + "->" + this.next.toString();
        } else {
            return this.val + "->" + "NULL";
        }
    }
}
