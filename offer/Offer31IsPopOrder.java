package com.yxm.offer;

import java.util.LinkedList;

public class Offer31IsPopOrder {
	
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA, popA));
	}
	

	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		if (pushA==null||popA==null||pushA.length!=popA.length) {
			return false;
		}
		LinkedList<Integer> stack = new LinkedList<Integer>();
		int popIndex = 0;
		for(int i = 0;i<pushA.length;i++){
			stack.push(pushA[i]);
			while (!stack.isEmpty()&&stack.peek()==popA[popIndex]) {
				stack.pop();
				popIndex++;
			}
		}
		return stack.isEmpty();
		
	}

}
