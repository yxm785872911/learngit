package com.yxm.erchasousuoshu;


public class Ercha {

	public static void main(String[] args) {
		
	}

	//二叉树数据结构可以使用   链表来实现  p,left,right
	
	//中序遍历算法
	public static void inorder_tree_walk(X x){
		if (x!=null) {
			inorder_tree_walk(x.left);
			System.out.println(x); 
			inorder_tree_walk(x.right);
		}
		
	}
	
	//---------------------------查询------------------------
	
	//search1
	public static X tree_search(X x,int k){
		if (x==null||k ==x.key) {
			return x;
		}
		if (k<x.key) {
			return tree_search(x.left, k);
		}else{
			return tree_search(x.right, k);
		}
	}
	
	//serach2
 	public static X iterative_tree_search(X x,int k){
 		while(x!=null&&k!=x.key){
 			if (k<x.key) {
				x = x.left;
			}else {
				x = x.right;
			}
 		}
 		return x;
 	}
	
 	//search for min
 	public static X tree_searchmin(X x){
 		while (x.left!=null) {
			x = x.left;
		}
 		return x;
 	}
 	
 	//search for max
 	public static X tree_searchmax(X x){
 		while (x.right!=null) {
			x = x.right;
		}
 		return x;
 	}
 	
 	//search for successor
 	public static X tree_successor(X x){
 		if (x.right!=null) {
			return tree_searchmin(x.right);
		}
 		X y = x.p;
 		while (y!=null&&x == y.right) {
 			x = y;
 			y = y.p;
		}
 		return y;
 	}
 	
 	//insert         T 为二叉树的根节点
 	public static void tree_insert(X T,X z){
 		X y = null;
 		X x = T;//此处T为根节点
 		while (x!=null) {
			y = x;				//退出循环后，y记录的是x的parent
			if (z.key<x.key) {
				x = x.left;
			}else {
				x = x.right;
			}
		}
 		z.p = y;
 		if (y==null) {
			T = z;			//表为空，将根节点设为z
		}else if (z.key<y.key) {
			y.left = z;
		}else {
			y.right = z;
		}
 	}
 	
 	
 	//delete实现
 	//首先定义一个子树替换的子过程
 	public static void transplant(X T,X u,X v){//用v替换u
 		if (u.p==null) {
			T = v;
		}else if (u== u.p.left) {
			u.p.left = v;
		}else {
			u.p.right = v;
		}
 		if (v!=null) {
			v.p = u.p;
		}
 	}
 	//利用上述子过程实现delete操作
 	public static void tree_delete(X T,X z){
 		if (z.left==null) {
			transplant(T, z, z.right);
		}else if (z.right == null) {
			transplant(T, z, z.left);
		}else{
			X y = tree_searchmin(z.right);
			if (y.p!=z) {//y为z右边子树的最小值，且必在z右边子树的左边，y此时没有左孩子
				transplant(T, y, y.right);
				y.right = z.right;
				y.right.p = y;
			}
			transplant(T, z, y);
			y.left = z.left;
			y.left.p = y;
		}
 	}
 	
}
class X{
	public int key;
	public X p;
	public X left;
	public X right;
	
	public X(int key){
		this(key,null,null,null);
	}

	public X(int key, X left, X right,X parent) {
		this.key = key;
		this.left = left;
		this.right = right;
		this.p = parent;
	}
	
}