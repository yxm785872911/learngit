package com.yxm.second;


public class Sort {
	
	public static void main(String[] args) {
		int[] arr = {12,5,4,3};
		/*insertion_sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		merge_sort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//分治法：将原问题分解为几个规模较小但类似于原问题的子问题，递归的求解这些子问题，然后在合并这些子问题的解来建立原问题的解
	
	//归并排序。关键是合并已经排好序的两个序列的合并
	public static void merge_sort(int[] nums,int p,int r){
		if (p<r) {
			int q = (p+r)/2;
			merge_sort(nums, p, q);
			merge_sort(nums, q+1, r);
			merge(nums, p, q, r);
		}
	}
	public static void merge(int[] nums,int p,int q, int r){
		int n1 = q - p +1;
		int n2 = r - q;
		int[] L = new int[n1 +1];
		int[] R = new int[n2 +1];
		for (int i = 0; i < n1; i++) {
			L[i] = nums[p+i];
		}
		L[n1] = Integer.MAX_VALUE;
		for (int i = 0; i < n2; i++) {
			R[i] = nums[q+i+1];
		}
		R[n2] = Integer.MAX_VALUE;
		
		int i = 0;
		int j = 0;
		for(int z = p;z<=r;z++){
			if (L[i]==Integer.MAX_VALUE&&R[j]==Integer.MAX_VALUE) {
				return;
			}else if (L[i]==Integer.MAX_VALUE) {
				nums[z] = R[j];
				j++;
			}else if (R[j]==Integer.MAX_VALUE) {
				nums[z] = L[i];
				i++;
			}else{
				if (L[i]<= R[j]) {
					nums[z] = L[i];
					i++;
				}
				else {
					nums[z] = R[j];
					j++;
				}
			}
		}
		
		
		
	}
	//插入排序
	public static void insertion_sort(int[] arr){
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j-1;
			while (i>=0 && arr[i]>key) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
		}
	}
	
}
