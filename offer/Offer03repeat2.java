package com.yxm.offer;

/**
 * 不修改数组找出重复数字。给出一个长度为n+1的数组，数组中只包含1-n之间的数，那么一定会有一个数是重复的，找出这个数。
 * 
 * 思路一：新建一个长度为n+1的数组，将原数组中的值m复制到下标为m的地方。空间复杂度是o(n)
 * 
 * 思路：统计某一个区间内数字出现的次数，进而缩小区间,时间复杂度是O(nlgn),空间复杂度是o(1);
 * @author DELL
 *
 */
public class Offer03repeat2 {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4,5};
		System.out.println(getDuplicate(arr));
	}
	public static int getDuplicate(int[] arr){
		if (arr==null||arr.length<=1) {
			return -1;
		}
		for(int i = 0;i<arr.length;i++){
			if (arr[i]>arr.length-1||arr[i]<1) {
				return -1;
			}
		}
		int start = 1;
		int end = arr.length-1;
		while (start<=end) {
			int mid = (start+end)>>1;
			int count = findCount(arr,start,mid);
			if (start==end) {
				if (count>1) {
					return start;
				}else{
					return -1;
				}
			}
			if (count>mid-start+1) {
				end = mid;
			}else{
				start = mid+1;
			}
			
		}
		return -1;
		
	}
	public static int findCount(int[] arr, int start, int mid) {
		if (arr==null||arr.length==0) {
			return 0;
		}
		int count = 0;
		for(int i = 0;i<arr.length;i++){
			if (arr[i]>=start&&arr[i]<=mid) {
				count++;
			}
		}
		return count;
	}
	
}
