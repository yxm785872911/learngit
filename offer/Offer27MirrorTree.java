package com.yxm.offer;

import com.yxm.tree.TreeNode;

public class Offer27MirrorTree {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void mirrorTree(TreeNode root){
		if (root==null) {
			return;
		}
		if (root.left==null&&root.right==null) {
			return;
		}
		//此时root根节点至少有一个孩子，那么需要交换两个节点的位置
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		//如果左节点不为null，那么递归求左节点的镜像
		if (root.left!=null) {
			mirrorTree(root.left);
		}
		if (root.right!=null) {
			mirrorTree(root.right);
		}
	}
}
