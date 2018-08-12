package com.yxm.offer;

import java.util.ArrayList;
import java.util.List;

public class Offer38Permutation {
	
	public static void main(String[] args) {
	}
	
	/**
	 * 求一个数组的全排列，可以看成两步：
	 * 		第一步求所有可能出现在第一个位置的字符，即把第一个字符和后面所有的字符交换；
	 * 		第二步固定一个字符，求后面所有字符串的排列；求后面所有字符串的排列也就是递归解法。
	 * 
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> premutation(int[] nums){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums==null||nums.length==0) {
			return list;
		}
		diGui(list,0,nums);
		return list;
	}

	public static void diGui(List<List<Integer>> list, int start, int[] nums) {
		if (start==nums.length-1) {
			List<Integer> list2 = new ArrayList<Integer>();
			for(int num : nums){
				list2.add(num);
			}
			return;
		}
		for(int j = start;j<nums.length;j++){
			swap(nums,start,j);
			diGui(list, start+1, nums);
			swap(nums, start, j);
		}
		
		
	}

	public static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	

}
