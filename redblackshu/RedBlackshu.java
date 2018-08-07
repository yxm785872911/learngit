package com.yxm.redblackshu;


public class RedBlackshu {
	
	//×óÐý
	public static void left_rotate(X T,X x){
		X y = x.right;
		x.right = y.left;
		if (y.left!=null) {
			y.left.p = x;
		}
		y.p = x.p;
		if (x.p==null) {
			T = y;
		}else if (x.p.left==x) {
			x.p.left =y;
		}else {
			x.p.right = y;
		}
		y.left = x;
		x.p = y;
	}
	
	//ÓÒÐý
	public static void right_rotate(X T,X y){
		X x = y.left;
		y.left = x.right;
		if (x.right!=null) {
			x.right.p = y;
		}
		x.p = y.p;
		if (y.p==null) {
			T = x;
		}else if (y.p.left==y) {
			y.p.left = x;
		}else {
			y.p.right = x;
		}
		x.right = y;
		y.p = x;
	}
	
	//²åÈë
	
	
}
