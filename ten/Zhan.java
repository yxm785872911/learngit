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


//ArrayDeque作为栈
public class Zhan{
	public static void main(String[] args) {
		ArrayDeque<String> stack = new ArrayDeque<>();
		//依次将3个元素push入栈
		stack.push("疯狂java讲义");
		stack.push("轻量级java ee企业级应用实战");
		stack.push("疯狂android讲义");
		
		System.out.println(stack);
		
		//pop出第一个元素
		System.out.println(stack.pop());
		System.out.println(stack);
	}
	
}
