package com.yxm.tabledshuangxiang;


public class IntSLLNode{
	public int info;
	public IntSLLNode next,prev;
	
	public IntSLLNode(int i){
		this(i,null,null);
	}
	
	public IntSLLNode(int i, IntSLLNode n,IntSLLNode p) {
		info = i;
		next = n;
		prev = p;
	}
	
	
	
	public static void main(String[] args) {
		IntSLLNode p = new IntSLLNode(10);
		p.next = new IntSLLNode(8);
		p.next.next = new IntSLLNode(50);
		
	}
	
}