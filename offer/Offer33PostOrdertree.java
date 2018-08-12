package com.yxm.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.yxm.tree.TreeNode;

public class Offer33PostOrdertree {
	
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
	}
	
	
	public List<Integer> postorderTraversal2(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
    	while (root!=null) {
    		list.add(root.val);			//先把根节点存入list集合
			if (root.left!=null) {
				stack.push(root.left);
			}
			root = root.right;
			if (root==null&&!stack.isEmpty()) {
				root = stack.pop();
			}
    	}
    	Collections.reverse(list);
    	return list;
    }
	
	
	
	
	/**
	 * 二叉搜索树的后序遍历序列
	 * 
	 * @param root
	 * @return
	 */
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> list = new ArrayList<Integer>();
    	postOrder_tree_walk(root, list);
    	return list;
    }

	public void postOrder_tree_walk(TreeNode root, List<Integer> list) {
		if (root!=null) {
			postOrder_tree_walk(root.left, list);
			postOrder_tree_walk(root.right, list);
			list.add(root.val);
		}
		
	}
	
	

}
