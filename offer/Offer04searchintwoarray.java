package com.yxm.offer;


public class Offer04searchintwoarray {
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15},
					
		};
		System.out.println(find(arr, 20));
	}
	
	/**
	 * 选对出发点很重要。   选择从左下角和右上角开始，每次可以排除一行或者一列，这样逐步缩小范围.
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean find(int[][] arr,int target){
	
		if (arr==null||arr.length==0||arr[0].length==0) {
			return false;
		}
		if (arr[0][0]>target||arr[arr.length-1][arr[0].length-1]<target) {
			return false;
		}
		int row = 0;
		int col = arr[0].length-1;
		while (row<arr.length&&col>=0) {
			if (arr[row][col]==target) {
				return true;
			}else if (arr[row][col]>target) {
				col--;
			}else{
				row++;
			}
		}
		return false;
	}
}
