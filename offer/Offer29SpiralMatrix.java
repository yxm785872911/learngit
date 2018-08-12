package com.yxm.offer;

import java.util.ArrayList;
import java.util.List;

import com.yxm.tree.TreeNode;

public class Offer29SpiralMatrix {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	


    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> list = new ArrayList<Integer>();
    	if (matrix==null||matrix.length==0||matrix[0].length==0) {
			return list;
		}
    	
    	int left = 0;
    	int right = matrix[0].length-1;
    	int top = 0;
    	int bottom = matrix.length-1;
    	
    	while (true) {
			for(int i = left;i<=right;i++){
				list.add(matrix[top][i]);
			}
			if (++top>bottom) {
				break;
			}
			
			for(int i = top;i<=bottom;i++){
				list.add(matrix[i][right]);
			}
			if (--right<left) {
				break;
			}
			
			for(int i = right;i>=left;i--){
				list.add(matrix[bottom][i]);
			}
			if (--bottom<top) {
				break;
			}
			
			for(int i = bottom;i>=top;i--){
				list.add(matrix[i][left]);
			}
			if (++left>right) {
				break;
			}
		}
    	return list;
    }
}
