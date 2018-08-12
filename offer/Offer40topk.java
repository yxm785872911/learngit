package com.yxm.offer;


public class Offer40topk {
	
	public static void main(String[] args) {
	}
	
	
	/**
	 * 求一个数组中第k小的数
	 * 可以使用快排的思想,判断我们所选中的那个数在一次排序之后的下标与k的关系，进而进行循环递归
	 * 	快排的思想需要修改原来的数组
	 * 
	 * 可以使用堆的思想
	 * 	建一个大小为k的最大堆，如果读入的数字比最大堆的最大值还要大，那么直接丢弃，
	 * 	如果小于最大堆的最大值，那么替换最大值，维护一下最大堆的性质，最后得到k个最小的数
	 * 
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	public int findKthLargest(int[] nums, int k) {
		return quickSort(nums,k,0,nums.length-1);
	}


	public int quickSort(int[] nums, int k, int start, int end) {
		int left = start;
		int right = end;
		int num = nums[end];
		for(int i = start;i<end;i++){
			if (nums[i]<num) {
				swap(nums,left++,i);
			}
		}
		swap(nums, left, end);
		if (k==left+1) {
			return nums[left];
		}else if (k<left+1) {
			return quickSort(nums, k, start, left-1);
		}else{
			return quickSort(nums, k, left+1, end);
		}
	}


	public void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
}
