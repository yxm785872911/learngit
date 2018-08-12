package com.yxm.offer;

import java.util.HashMap;
import java.util.Map;

public class Offer35CopyListwithRandomPointer {
	
	public static void main(String[] args) {
	}
	
	/**
	 * 复杂链表的复制，一个链表的节点除了指向下一个节点的指针外，还存在一个随机指针可以指向任何节点
	 * 需求：复制该链表到一个新的链表中
	 * 
	 * 使用hashMap可以在o(1)的时间内找到已经出现过的节点
	 * 
	 * @param head
	 * @return
	 */
    public RandomListNode copyRandomList(RandomListNode head) {
    	if (head==null) {
			return null;
		}
    	RandomListNode newhead = new RandomListNode(head.label);
    	RandomListNode cur = newhead;	
    	Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
    	map.put(head, newhead);
    	while (head.next!=null) {
			if (!map.containsKey(head.next)) {
				map.put(head.next, new RandomListNode(head.next.label));
			}
			cur.next = map.get(head.next);
			if (head.random!=null) {
				if (!map.containsKey(head.random)) {
					map.put(head.random, new RandomListNode(head.random.label));
				}
				cur.random = map.get(head.random);
			}
			head = head.next;
			cur = cur.next;
		}
    	if (head.random!=null) {
			if (!map.containsKey(head.random)) {
				map.put(head.random, new RandomListNode(head.random.label));
			}
			cur.random = map.get(head.random);
		}
    	return newhead;
    }

}
