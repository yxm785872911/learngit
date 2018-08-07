package com.yxm.table;


public class IntSLLNode{
	public int info;
	public IntSLLNode next;
	
	public IntSLLNode(int i){
		this(i,null);
	}
	
	public IntSLLNode(int i, IntSLLNode n) {
		info = i;
		next = n;
	}
	
	
	
	public static void main(String[] args) {
		IntSLLNode p = new IntSLLNode(10);
		p.next = new IntSLLNode(8);
		p.next.next = new IntSLLNode(50);
		
	}
	
}