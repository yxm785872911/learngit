package com.yxm.offer;


public class Offer39MoreThanHalfNum {
	
	public static void main(String[] args) {
		String s1 = "abc" + "def";
		String s2 = new String(s1);
		if (s1==s2) {
			System.out.println("a");
		}
		if (s1.equals(s2)) {
			System.out.println("b");
		}
	}
	
	/**
	 * 题目要求输入一个数组， 需要求出数组中出现次数超过一半的那个数字
	 * 
	 * 1 如果数组中存在一个数字出现的次数超过一半，那么对数组排序后出现在数组中间的那个值肯定就是需要求出的数字
	 * 		这种思路的时间复杂度是Onlg(n)
	 * 
	 * 2根据题目要求，我们知道所求数字出现的次数比其他所有数字出现的次数之和都多
	 * 		因此我们可以在b遍历数组的时候维护两个数，一个是数组中的一个数字，另一个是出现的次数。
	 * 		当我们遍历到下一个数字的时候，如果下一个数字和我们之前保存的数字相同，则将次数加1；如果不相同，那么将次数减1；
	 * 		如果次数等于0，那么保存下一个数字，并将次数设为1.
	 * 		我们要找的数字肯定是最后一个将次数设为1的那个数字
	 * @param arr
	 * @return
	 */
	public static int moreThanHalfNum(int[] arr){
		if (arr.length==1) {
			return arr[0];
		}
		int major = arr[0];
		int count = 1;
		for(int i = 1;i<arr.length;i++){
			if (count==0) {
				count++;
				major = arr[i];
			}else if (major==arr[i]) {
				count++;
			}else{
				count--;
			}
		}
		return major;
	}
	
}
