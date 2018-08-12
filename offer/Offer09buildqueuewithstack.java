package com.yxm.offer;


public class Offer09buildqueuewithstack {
	
	public static void main(String[] args) {
		String str = "we are happy";
	}
	/**
	 * 用两个栈实现队列
	 * 一个栈用来实现队列的offer
	 * 
	 * 另外一个栈用来实现队列的poll()
	 * 	poll的时候首先判断这个栈是否为空，如果不为空，直接pop().
	 * 	如果为空，那么将第一个栈中的数据都push进第二个栈，再执行pop()方法。
	 * 
	 */
	
	/**
	 * 用两个队列实现栈：
	 * 
	 * 	每次push数据进栈的时候，将数据放入不为空的队列的末尾。
	 * 
	 * pop数据的时候，将有数据的队列中的数据依次放入另外一个队列中，
	 * 维护一个指针当size==1的时候结束循环，poll出第一个队列中的数据。
	 */

}
