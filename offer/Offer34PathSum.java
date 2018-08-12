package com.yxm.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.yxm.tree.TreeNode;

public class Offer34PathSum {
	
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
	}
	
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root==null) {
			return list;
		}
		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(root.val);
		diGui(root,list,arraylist,sum-root.val);
		return list;
	}


	public void diGui(TreeNode root, List<List<Integer>> list, List<Integer> arraylist, int sum) {
		if (sum==0&&root.left==null&&root.right==null) {
			list.add(new ArrayList<Integer>(arraylist));
			return;
		}
		
		if (root.left!=null) {
			arraylist.add(root.left.val);
			diGui(root.left, list, arraylist, sum-root.left.val);
			arraylist.remove(arraylist.size()-1);
		}
		
		if (root.right!=null) {
			arraylist.add(root.right.val);
			diGui(root.right, list, arraylist, sum-root.right.val);
			arraylist.remove(arraylist.size()-1);
		}
	}

}
