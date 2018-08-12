package com.yxm.offer;

import com.yxm.tree.TreeNode;

public class Offer28SymmetricTree {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
    public boolean isSymmetric(TreeNode root) {
    	if (root==null) {
			return true;
		}
    	return mySymmetric(root.left,root.right);
    	
    }

	public boolean mySymmetric(TreeNode left, TreeNode right) {
		if (left==null||right==null) {
			return left == right;
		}
		if (left.val!=right.val) {
			return false;
		}
		return mySymmetric(left.left, right.right)&&mySymmetric(left.right, right.left);
	}
}
