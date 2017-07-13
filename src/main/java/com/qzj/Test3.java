package com.qzj;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值
 * <p>
 * 时间限制：1秒 空间限制：32768K 热度指数：257256
 */
public class Test3 {


    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            resultList.add(stack.pop());
        }
        return resultList;
    }
}
