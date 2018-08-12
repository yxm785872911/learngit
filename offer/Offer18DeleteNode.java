package com.yxm.offer;

import com.yxm.leetcode.ListNode;

public class Offer18DeleteNode {
	
	public static void main(String[] args) {
	}

	/**
	 *	删除一个链表中指定节点的两种方式：
	 *		一：从头开始遍历节点
	 *		二：将指定节点的下一个节点的值替换当前节点的值，并更新节点的指针。（前提是指定的链表中一定包含该节点）
	 *			需要考虑的情况有：
	 *				头结点为null的时候直接返回null；
	 *				只有一个节点并且该节点的值等于要删除的节点的值，那么也应该返回null
	 *				给定节点是尾节点的时候需要从头开始遍历。
	 * @param head
	 * @param node
	 */
	public static void deleteNode(ListNode head,ListNode node){
		if (head==null||(head.next==null&&node==head)) {
			head = null;
			return;
		}
		if (node.next!=null) {
			ListNode tmp = node.next;
			node.val = node.next.val;
			node.next = node.next.next;
			tmp.next = null;
		}else{
			ListNode tmp = head;
			while (tmp.next!=node) {
				tmp = tmp.next;
			}
			tmp.next = null;
		}
		
	}
	
	
}
