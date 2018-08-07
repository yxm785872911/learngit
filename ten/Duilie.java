package com.yxm.ten;

import java.util.ArrayDeque;

/*
 * 队列：Queue：先进先出
 * 		PriorityQueue是一个比较标准的队列实现，是因为该队列中的元素会按照元素自身的大小进行重新排序
 * 
 * 	Duque是一个 queue的子接口，代表一个双端队列    即可作为队列又可作为栈
 * 		ArrayDeque 实例如下
 * 
 * 
 */

//ArrayDeque作为队列
public class Duilie {
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		
		//offer是队列方法，会将元素加到队列尾部
		queue.offer("疯狂java讲义");
		queue.offer("轻量级java ee企业应用实战");
		queue.offer("疯狂android讲义");
		System.out.println(queue);
		
		//访问队列头部元素且并不删除
		System.out.println(queue.peek());
		System.out.println(queue);
		
		//访问队列头部元素并进行删除
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	
}

