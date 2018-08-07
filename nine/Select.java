package com.yxm.nine;

import java.util.Random;

public class Select {
	
	public static void main(String[] args) {
		int[] nums = {4,1,3,2,16,9,10,14,8,7};
		System.out.println(randomized_select(nums, 0, nums.length-1, 5));
	}
	
	//ѡ���㷨���������е�i����Сֵ
	public static int randomized_select(int[] nums,int start,int end,int target){
		if (start==end) {
			return nums[start];
		}
		int mid = randomized_paritition(nums, start, end);
		int k = mid - start + 1;
		if (target==k) {
			return nums[mid];
		}else if (target<k) {
			return randomized_select(nums, start, mid-1, target);
		}else{
			return randomized_select(nums, mid+1, end, target-k);
		}
	}
	
	//�����ʵ��
	public static int randomized_paritition(int[] nums,int start,int end){
		Random random = new Random();
		int index = random.nextInt(end-start)+start;
		
		int tmp = nums[index];
		nums[index]= nums[end];
		nums[end] = tmp;
		
		return partition(nums, start, end);
	}
	
	public static int partition(int[] nums, int start, int end) {
		//�����һ��Ԫ����Ϊ��Ԫ��ǰ���Ԫ�ؽ��бȽ�
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
