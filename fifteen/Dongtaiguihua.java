package com.yxm.fifteen;

/*
 * 钢条切割问题
 */

public class Dongtaiguihua {
	
	public static void main(String[] args) {
		int[] arr = {0,1,5,8,9,10,17,17,20,24,30};
		int length = 7;
		System.out.println(bottom_up_cut_rod(arr, length));
	}
	
	//自底向上实现
	public static int bottom_up_cut_rod(int[] price,int length){
		int[] r = new int[length+1];
		r[0] = 0;
		for (int i = 1; i <= length; i++) {
			int max = -1;
			for (int j = 1; j <= i; j++) {
				max = Math.max(max, price[j]+r[i-j]);
			}
			r[i] = max;
		}
		return r[length];
	}
	
}
