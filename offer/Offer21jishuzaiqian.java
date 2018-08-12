package com.yxm.offer;

public class Offer21jishuzaiqian {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		reOrderArray(arr);
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * 维护两个指针。第一个指针初始化的时候指向数组的第一个数字，它只向后移动，第二个指针初始化的时候指向数组的最后一个数字，只向前移动。
	 * 	第一个指针移动到偶数的位置停止，第二个指针移动到奇数的位置停止，然后接着循环。
	 * @param arr
	 */
	public static void reOrderArray(int[] arr){
		if (arr==null||arr.length==0) {
			return;
		}
		int left = 0;
		int right = arr.length-1;
		while (left<right) {
			while (arr[left]%2!=0) {
				left++;
			}
			while (arr[right]%2==0) {
				right--;
			}
			if (left<right) {
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
			}
		}
	}
	
	
    
}
