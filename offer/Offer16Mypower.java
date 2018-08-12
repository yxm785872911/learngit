package com.yxm.offer;


public class Offer16Mypower {
	
	public static void main(String[] args) {
		System.out.println(new Offer16Mypower().myPow(0, 1));
	}
	
	public double myPow(double x,int n){
		if (x==0&&n<0) {
			throw new RuntimeException("您输入的数字是非法的");
		}
		if (n<0) {
			return 1/power(x,-n);
		}else{
			return power(x,n);
		}
	}

	public double power(double x, int n) {
		if (n==0) {
			return 1;
		}
		
		double num = power(x, n/2);
		
		if (n%2==0) {
			return num * num;
		}else{
			return num*num*x;
		}
	}
	
}
