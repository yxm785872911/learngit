package com.yxm.offer;

import com.yxm.tree.TreeNode;

public class Offer37Serialize {
	
	public static void main(String[] args) {
	}
	
	private static int index = -1;
	
	/**
	 *	二叉树的序列化是指把一颗二叉树按照某种遍历方式的结果以某种格式保存为字符串。
	 *	注意序列化的时候应该将叶节点的null指针也存进去，（因为只有一种遍历的情况下无法重建二叉树）
	 *		
	 *		序列化：先序列化根节点，之后递归序列化左右节点
	 *	        反序列化：反序列化的时候维护一个全局的指针，记录已经反序列化的指针位置，将字符串拆分成字符串数组，进行反序列化
	 *
	 * @param root
	 * @return
	 */
	public static String toString(TreeNode root){
		 StringBuilder builder = new StringBuilder();
		 pre(root,builder);
		 return builder.toString();
	}

	public static void pre(TreeNode root, StringBuilder builder) {
		if (root==null) {
			builder.append("#!");
		}else{
			builder.append(root.val+"!");
			pre(root.left, builder);
			pre(root.right, builder);
		}
	}
	
	public static TreeNode deSerialize(String str){
		index++;
		if (index>=str.length()) {
			return null;
		}
		String[] arr = str.split("!");		
		TreeNode root = null;
		if (!arr[index].equals("#")) {
			root = new TreeNode(Integer.valueOf(arr[index]));
			root.left = deSerialize(str);
			root.right = deSerialize(str);
		}
		return root;
	}
	
}
