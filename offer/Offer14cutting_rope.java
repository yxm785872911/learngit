package com.yxm.offer;

public class Offer14cutting_rope {
	
	public static void main(String[] args) {
		System.out.println(max_muti(5));
	}

	/*
	 * 可以使用动态规划问题的四个特点：
	 * 	1  目的是要求一个问题的最优解
	 * 	2 整体问题的最优解依赖于子问题的最优解；
	 *  3子问题之间还有相互重叠的更小的子问题；
	 *  4可以从下往上的顺序先计算小问题的最优解并存储下来
	 */
	public static int max_muti(int n){
		if (n<2) return 0;
		if (n==2) return 1;
		if (n==3) return 2;
		
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		for(int i = 4;i<n+1;i++){
			int max = 0;
			for(int j = 1;j<=i/2;j++){
				max = Math.max(arr[j]*arr[i-j], max);
			}
			arr[i] = max;
		}
		return arr[n];
	}

}
