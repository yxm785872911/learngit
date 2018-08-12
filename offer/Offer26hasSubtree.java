package com.yxm.offer;

import com.yxm.tree.TreeNode;

public class Offer26hasSubtree {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * 输入两个二叉树A和B，判断B是不是A的子结构
	 * 	此处子结构的定义是B可以是A的子树的一部分，不用和A的子树完全匹配
	 */
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s==null&&t==null) {
			return true;
		}
		if (s==null) {
			return false;
		}
		if (isSame(s,t)) {
			return true;
		}
		return isSubtree(s.left, t)||isSubtree(s.right, t);
	}

	public boolean isSame(TreeNode s, TreeNode t) {
		if(t==null){
			return true;
		}
		if (s==null) {
			return false;
		}
		if (s.val!=t.val) {
			return false;
		}
		return isSame(s.left, t.left)&&isSame(s.right, t.right);
	}

}
