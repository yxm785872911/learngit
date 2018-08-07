package com.yxm.six;


public class Sort {
	
	public static void main(String[] args) {
		int[] nums = {4,1,3,2,16,9,10,14,8,7};
		heapsort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	//堆排序
	public static void heapsort(int[] nums){
		build_max_heap(nums);
		int heap_size = nums.length;
		for(int i = nums.length-1;i>0;i--){
			//交换nums[0]和nums[i]
			int tmp = nums[0];
			nums[0] = nums[i];
			nums[i] = tmp;
			
			heap_size -= 1; 
			max_heapify(nums, 0, heap_size);
		}
		
	}
	
	
	//构建最大堆
	//nums[n/2+1]及以后的元素都是叶节点，所以只需遍历之前的元素
	public static void build_max_heap(int[] nums){
		int heap_size = nums.length;
		for(int i = heap_size/2-1;i>=0;i--){
			max_heapify(nums,i,heap_size);
		}
	}
	
	
	public static void max_heapify(int[] nums,int num,int heap_size){
		//将该根节点和其子节点进行条件判断
		int left = 2*num+1;
		int right = 2*num+2;
		int largest = 0;
		
		if (left<heap_size&&nums[left]>nums[num]) {
			largest = left;
		}else {
			largest = num;
		}
		
		if (right<heap_size&&nums[right]>nums[largest]) {
			largest = right;
		}
		
		if (largest != num) {
			
			//交换根节点和较大的子节点
			int tmp = nums[num];
			nums[num] = nums[largest];
			nums[largest] = tmp;
			
			//递归调用
			max_heapify(nums, largest,heap_size);
		}
	}
	
	
	
}
