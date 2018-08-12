package com.yxm.offer;

import com.yxm.leetcode.ListNode;

public class Offer18DeleteNode2 {
	
	public static void main(String[] args) {
	}
	
	/**
	 * 所有重复的节点只保留一个
	 * @param head
	 * @return
	 */
    public ListNode deleteDuplicates1(ListNode head) {
    	ListNode list = head;
    	while (list!=null) {
			if (list.next==null) {
				break;
			}
			if (list.val==list.next.val) {
				list.next = list.next.next;
			}else{
				list = list.next;
			}
		}
    	return head;
    }
    
    /**
     * 要求将所有重复的节点全部删除
     * 	必须使用两个指针
     * @param head
     * @return
     */
    public ListNode deleteDuplicates2(ListNode head) {
    	ListNode newhead = new ListNode(0);
    	ListNode fast = head,slow = newhead;
    	slow.next = fast;
    	while (fast!=null) {
			while (fast.next!=null&&fast.val==fast.next.val) {
				fast = fast.next;
			}
			if (slow.next!=fast) {
				slow.next = fast.next;
				fast = slow.next;
			}else{
				slow = slow.next;
				fast = fast.next;
			}
		}
    	return newhead.next;
    	
    }
    
    
}
