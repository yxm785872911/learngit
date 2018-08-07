package com.yxm.tabledshuangxiang;


public class IntSLList {
	protected IntSLLNode head,tail;
	
	public IntSLList ()	{
		head = tail = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void addToHead(int el){
		head = new IntSLLNode(el,head,null);
		if (tail == null) {
			tail = head;
		}
		
	}
	
	public void addToTail(int el){
		if (!isEmpty()) {
			tail = new IntSLLNode(el, null, tail);
			tail.prev.next = tail;
		}else{
			head = tail = new IntSLLNode(el);
		}
	}
	
	public int deleteFromHead(){
		int el = head.info;
		if (head == tail) {
			head = tail = null;
		}
		else{
			head = head.next;
		}
		return el;
	}
	
	public int deleteFromTail(){
		int el = tail.info;
		if (head == tail) {
			head = tail = null;
		}else{
			tail = tail.prev; 
			tail.next = null;
		}
		return el;
	}
	
	public void printAll()	{
		for(IntSLLNode tmp = head; tmp!=null;tmp = tmp.next){
			System.out.println(tmp.info+" ");
		}
	}
	public boolean isInList(int el){
		IntSLLNode tmp;
		for(tmp = head; tmp!=null&&tmp.info!=el;tmp = tmp.next);
		return tmp != null;	
		
	}
	
	public void delete(int el){
		if (!isEmpty()) {
			if (head==tail && el == head.info) {
				head = tail = null;
			}else if(el == head.info){
				head = head.next;
			}else {
				IntSLLNode pred,tmp;
				for(pred = head,tmp= head.next; tmp!=null&&tmp.info!=el;pred = pred.next,tmp= tmp.next);
				if (tmp!=null) {
					pred = tmp.next;
					if (tmp == tail) {
						tail= pred;
					}
				}
			}
		}
	}
	
	
}
