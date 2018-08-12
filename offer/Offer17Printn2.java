package com.yxm.offer;

public class Offer17Printn2 {
	
	public static void main(String[] args) {
		print1ToMaxOfNDigits(2);
	}
	/**
	 * 题目要求输入数字n,按数字打印出从1到最大的n位十进制数，比如输入3，打印出从1,2,3到999的所有数字
	 * 
	 * 题目隐含的条件是大数问题，如果超出了int的范围呢
	 * 
	 * 所以我们应该考虑使用数组来实现这个功能
	 * @param n
	 */
	public static void print1ToMaxOfNDigits(int n){
		if (n<=0) {
			return;
		}
		int[] arr = new int[n];
		while (!increment(arr)) {
			print(arr);
		}
		
	}
	public static void print(int[] arr) {
		int i = 0;
		while (arr[i] == 0) {
			i++;
		}
		while (i<arr.length) {
			System.out.print(arr[i++]);
		}
		System.out.print("\t");
	}
	public static boolean increment(int[] arr) {
		boolean flag = false;			//flag用来记录是否打印到最后一个值
		int jinwei = 0;					//jinwei用来记录加1后的进位情况
		int len = arr.length;
		int sum = 0;
		for(int i = len-1;i>=0;i--){
			sum = arr[i]+jinwei;
			if (i==len-1) {
				sum += 1;
			}else{
				if (jinwei==0) {
					break;
				}
			}
			if (sum>=10) {
				if (i==0) {
					flag = true;
					break;
				}else{
					jinwei = 1;
					arr[i] = sum - 10;
				}
			}else{
				arr[i] = sum;
				break;
			}
		}
		return flag;
		
	}
	
	
	
	
	
}
