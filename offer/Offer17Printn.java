package com.yxm.offer;

public class Offer17Printn {
	
	public static void main(String[] args) {
		print1ToMaxOfNDigits(2);
	}
	/**
	 * 题目要求输入数字n,按数字打印出从1到最大的n位十进制数，比如输入3，打印出从1,2,3到999的所有数字
	 * 
	 * 题目隐含的条件是大数问题，如果超出了int的范围呢
	 * 
	 * 所以我们应该考虑使用字符串来实现这个功能
	 * @param n
	 */
	public static void print1ToMaxOfNDigits(int n){
		if (n<=0) {
			return;
		}
		char[] ch = new char[n];
		for(int i = 0;i<n;i++){
			ch[i] = '0';
		}
		while (!increment(ch)) {
			print(ch);
		}
		
	}
	public static void print(char[] ch) {
		int i = 0;
		while (ch[i]=='0') {
			i++;
		}
		while (i<ch.length) {
			System.out.print(ch[i++]);
		}
		System.out.print("\t");
	}
	public static boolean increment(char[] ch) {
		int jinwei = 0;				//jinwei用来记录加1后的进位情况
		boolean flag = false;		//flag用来记录是否溢出，即是否打印到最后一个数字了
		int len = ch.length;
		int sum = 0;
		for(int i = len-1;i>=0;i--){
			sum = ch[i] - '0' + jinwei;
			if (i==len-1) {
				sum += 1;
			}
			if (sum>=10) {
				if (i==0) {
					flag = true;
				}else{
					jinwei = 1;
					ch[i] = (char)(sum - 10 + '0');
				}
			}else{
				ch[i] = (char)(sum + '0');
				break;
			}
		}
		return flag;
	}
	
	
	
	
	
}
