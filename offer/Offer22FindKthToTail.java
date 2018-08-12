package com.yxm.offer;

import com.yxm.leetcode.ListNode;

public class Offer22FindKthToTail {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	

	/**
	 * 增强代码的健壮性	
	 * 	边界条件判断
	 * 	如果链表的长度小于n呢
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
    public ListNode FindNthFromEnd(ListNode head, int n) {
    	if (head==null||n<=0) {
			return null;
		}
    	ListNode slow = head;
    	ListNode fast = head;
    	for(int i = 0;i<n-1;i++){
    		if (fast.next!=null) {
				fast = fast.next;
			}else{
				return null;			//如果链表的长度小于n，直接返回null
			}
    	}
    	while (fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
    	return slow;
    }
}
