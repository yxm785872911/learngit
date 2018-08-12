package com.yxm.offer;

/**
 * 找出数组中重复的数字
 * 	排序：nlg(n)
 *  hashmap：空间复杂度o(n),时间复杂度o(n)
 *  利用数组中数据的性质：长度为n的数组中只包含 0~n-1的数据。所以可以将相应数字放在其对应下标处，如果对应下标的地方已经存在
 *  	相应的数字了，那么即找到重复数字，返回true，否则返回false。
 * @author DELL
 *
 */
public class Offer03repeat {
	
	public static void main(String[] args) {
		int[] arr = {1,3,1,1,4,5};
		System.out.println(findRepeat(arr));
	}
	
	public static boolean findRepeat(int[] arr){
		if (arr==null||arr.length<=1) {
			return false;
		}
		for(Integer num : arr){
			if (num<0||num>arr.length-1) {
				return false;
			}
		}
		for(int i = 0;i<arr.length;i++){
			while (arr[i]!=i) {
				if (arr[i]!=arr[arr[i]]) {
					swap(arr, i, arr[i]);
				}else{
					return true;
				}
			}
		}
		return false;
	}

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
