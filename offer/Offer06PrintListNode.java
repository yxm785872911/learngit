package com.yxm.offer;

import java.util.LinkedList;

import com.yxm.leetcode.ListNode;

public class Offer06PrintListNode {
	
	public static void main(String[] args) {
		String str = "we are happy";
	}

	/**
	 * 要求从尾到头打印链表
	 * 首先要明确能否修改链表：
	 * 	有空间要求的情况下，可以反转链表，然后进行打印
	 * 	没有空间要求的情况下，可以使用栈的数据结构
	 * @param head
	 */
	public static void printListNode(ListNode head){
		if (head==null) {
			return;
		}
		ListNode c = head;
		LinkedList<ListNode> stack = new LinkedList<ListNode>();
		while (c!=null) {
			stack.push(c);
			c = c.next;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop().val);
		}
	}
	public static void printListNode2(ListNode head){
		if (head==null) {
			return;
		}
		ListNode node = head;
		ListNode newhead = null;
		while (node!=null) {
			ListNode tmp = node.next;
			node.next = newhead;
			newhead = node;
			node = tmp;
		}
		while (newhead!=null) {
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
	}
}
