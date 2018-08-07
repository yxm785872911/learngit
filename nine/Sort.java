package com.yxm.nine;

import java.util.Random;

public class Sort {
	
	public static void main(String[] args) {
		int[] nums = {4,1,3,2,16,9,10,14,8,7};
		quicksort(nums, 0, nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	
	//快速排序的随机化版本
	public static void quicksort(int[] nums,int start,int end){
		if (start<end) {
			//mid左边的元素都小于nums[mid]，右边的元素都大于nums[mid]
			int mid = randomized_paritition(nums,start,end);
			quicksort(nums, start, mid-1);
			quicksort(nums, mid+1, end);
		}
	}

	//随机化实现
	public static int randomized_paritition(int[] nums,int start,int end){
		Random random = new Random();
		int index = random.nextInt(end-start)+start;
		
		int tmp = nums[index];
		nums[index]= nums[end];
		nums[end] = tmp;
		
		return partition(nums, start, end);
	}
	
	public static int partition(int[] nums, int start, int end) {
		//将最后一个元素作为主元与前面的元素进行比较
		int x = nums[end];
		int i = start-1;
		for (int j = start; j < end; j++) {
			if (nums[j]<x) {
				i = i+1;
				int tmp = nums[i];
				nums[i] = nums[j];
				nums[j] = tmp;
			}
		}
		int tmp = nums[i+1];
		nums[i+1] = nums[end];
		nums[end] = tmp;
		return i+1;
	}
	
	
	
	
}
