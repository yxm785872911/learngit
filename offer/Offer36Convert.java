package com.yxm.offer;

import com.yxm.tree.TreeNode;

public class Offer36Convert {
	
	public static void main(String[] args) {
	}
	
	/**
	 *	将二叉搜索树转换为双向链表
	 * @param root
	 * @return
	 */
	public static TreeNode convert(TreeNode root){
		TreeNode lastNode = null;
		lastNode = baseConvert(root,lastNode);
		TreeNode head = lastNode;
		while (head.left!=null) {
			head = head.left;
		}
		return head;
	}

	public static TreeNode baseConvert(TreeNode root, TreeNode lastNode) {
		if (root==null) {
			return lastNode;
		}
		TreeNode current = root;
		if (current.left!=null) {
			lastNode = baseConvert(current.left, lastNode);
		}
		current.left = lastNode;
		if (lastNode!=null) {
			lastNode.right = current;
		}
		lastNode = current;
		if (current.right!=null) {
			lastNode = baseConvert(current.right, lastNode);
		}
		return lastNode;
	}
	
	
}
