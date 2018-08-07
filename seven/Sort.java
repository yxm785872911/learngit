package com.yxm.seven;


public class Sort {
	
	public static void main(String[] args) {
		int[] nums = {4,1,3,2,16,9,10,14,8,7};
		quicksort(nums, 0, nums.length-1);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	
	//��������
	public static void quicksort(int[] nums,int start,int end){
		if (start<end) {
			//mid��ߵ�Ԫ�ض�С��nums[mid]���ұߵ�Ԫ�ض�����nums[mid]
			int mid = partition(nums,start,end);
			quicksort(nums, start, mid-1);
			quicksort(nums, mid+1, end);
		}
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