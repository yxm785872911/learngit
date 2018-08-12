package com.yxm.offer;

public class Offer11MinInrotatedArray {
	
	public static void main(String[] args) {
		int[] arr = {2,0,1,1,2};
		System.out.println(findminindexInrotatedarray(arr));
	}

	/**
	 * left指针维护左边数组的最大值，
	 * right指针维护右边数组的最小值
	 * 如果数组中的数字都是递增的，那么直接返回arr[0]
	 * @param arr
	 * @return
	 */
	public static int findminindexInrotatedarray(int[] arr){
		if (arr==null||arr.length==0) {
			return -1;
		}
		int left = 0;
		int right = arr.length-1;
		int index = left;
		while (arr[left]>=arr[right]) {
			if (right-left==1) {
				index = right;
				break;
			}
			int mid = (left+right)>>1;
			if (arr[left]==arr[mid]&&arr[mid]==arr[right]) {    //10111,11101需要排除这种情况
				return MinInoder(arr, left, right);
			}
			if (arr[left]<=arr[mid]) {
				left = mid;
			}else if (arr[mid]<=arr[right]) {
				right = mid;
			}
		}
		return arr[index];
	}

	public static int MinInoder(int[] arr, int left, int right) {
		int min = arr[0];
		for(int i = left;i<=right;i++){
			min = Math.min(min, arr[i]);
		}
		return min;
	}
}
