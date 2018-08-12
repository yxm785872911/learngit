package com.yxm.offer;

public class Offer05ReplaceSpace {
	
	public static void main(String[] args) {
		String str = "we are happy";
		System.out.println(replaceBlank(str));
	}
	
	/**
	 * 从后往前替换，每一个字符只需要移动一次。
	 * @param str
	 * @return
	 */
	public static String replaceBlank(String str){
		if (str==null||str.length()==0) {
			return str;
		}
		StringBuilder builder = new StringBuilder(str);
		int len = builder.length();
		int count = 0;
		for(int i = 0;i<str.length();i++){
			if (str.charAt(i)==' ') {
				count++;
			}
		}
		if (count==0) {//字符串中没有空格需要进行替换
			return str;
		}
		len = len+count*2;
		builder.setLength(len);
		
		int index = str.length()-1;
		int indexnew = len-1;

		while (index!=indexnew) {
			if (str.charAt(index)!=' ') {
				builder.setCharAt(indexnew--, str.charAt(index--));
			}else{
				index--;
				builder.setCharAt(indexnew--, '0');
				builder.setCharAt(indexnew--, '2');
				builder.setCharAt(indexnew--, '%');
			}
		}
		return builder.toString();
	}
}
