package com.yxm.offer;

public class Offer13MovingCount {
	
	public static void main(String[] args) {
		int[] arr = {2,0,1,1,2};
		System.out.println(movingCount(10, 1, 10));
	}

	public static int movingCount(int k,int m,int n){
		if (m<=0||n<=0||k<0) {
			return 0;
		}
		boolean[][] arr = new boolean[m][n];
		for(int i = 0;i<m;i++){
			for(int j = 0;j<n;j++){
				arr[i][j] = false;
			}
		}
		return movingCountcore(k,m,n,0,0,arr);
	}

	public static int movingCountcore(int k, int m, int n, int i, int j, boolean[][] arr) {
		int count = 0;
		if (!arr[i][j]&&(getDigitSum(i)+getDigitSum(j)<=k)) {
			count++;
			arr[i][j] = true;
			if (i>0) {
				count += movingCountcore(k, m, n, i-1, j, arr);
			}
			if (i<m-1) {
				count += movingCountcore(k, m, n, i+1, j, arr);
			}
			if (j>0) {
				count += movingCountcore(k, m, n, i, j-1, arr);
			}
			if (j<n-1) {
				count += movingCountcore(k, m, n, i, j+1, arr);
			}
		}
		return count;
	}
	public static int getDigitSum(int num){
		int result = 0;
		while (num>0) {
			result += num%10;
			num = num/10;
		}
		return result;
	}
}
