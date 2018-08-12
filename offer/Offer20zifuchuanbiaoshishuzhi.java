package com.yxm.offer;


public class Offer20zifuchuanbiaoshishuzhi {
	
	public static void main(String[] args) {
		System.out.println(isNumeric("+12.e1"));
	}
	

	public static boolean isNumeric(String s){
		if (s==null||s.length()==0) {
			return false;
		}
		int index = 0;
		//判断是否有符号
		if (s.charAt(index)=='+' || s.charAt(index)=='-') {
			index++;
		}
		if (index == s.length()) {
			return false;
		}
		//扫描数字
		index = scanInteger(s,index);
		if (index<s.length()) {
			//如果有小数点
			if (s.charAt(index)=='.') {
				index++;
				scanInteger(s, index);
				if (index<s.length()) {
					if (s.charAt(index)=='E'||s.charAt(index)=='e') {
						index++;
						return isExponential(s,index);
					}
					return false;
				}else{
					return true;
				}
			}else if (s.charAt(index)=='e'||s.charAt(index)=='E') {
				index++;
				return isExponential(s, index);
			}
			return false;
		}else{
			return true;
		}
	}


	private static boolean isExponential(String s, int index) {
		if (index<s.length()) {
			if (s.charAt(index)=='+'||s.charAt(index)=='-') {
				index++;
			}
			index = scanInteger(s, index);
			if (index==s.length()) {
				return true;
			}
			return false;
		}
		return false;
	}


	public static int scanInteger(String s, int index) {
		while (index<s.length()&&s.charAt(index)>='0'&&s.charAt(index)<='9') {
			index++;
		}
		return index;
	}
	
	
    
}
