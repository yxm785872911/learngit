package com.yxm.offer;

public class Offer15bityunsuan {
	
	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE<<1);
		System.out.println(numberof13(-2));
	}
	
	public static int numberOf1(int n){
		int count = 0;
		for(int i = 0;i<32;i++){
			if ((n&(1<<i))==(1<<i)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * 使用java的无符号右移
	 * @param n
	 * @return
	 */
	public static int numberOf12(int n){
		int count = 0;
		while (n!=0) {
			if ((n&1)==1) {
				count++;
			}
			n = n >>> 1;
		}
		return count;
	}
	
	/**
	 * 把一个整数减1，再和原来的整数做相与运算，会把该整数最右边的1变成0。
	 * @param n
	 * @return
	 */
	public static int numberof13(int n){
		int count = 0;
		while (n!=0) {
			count++;
			n = (n-1)&n;
		}
		return count;
	}
	
}
