package com.yxm.ten;

import java.util.ArrayDeque;

/*
 * ���У�Queue���Ƚ��ȳ�
 * 		PriorityQueue��һ���Ƚϱ�׼�Ķ���ʵ�֣�����Ϊ�ö����е�Ԫ�ػᰴ��Ԫ������Ĵ�С������������
 * 
 * 	Duque��һ�� queue���ӽӿڣ�����һ��˫�˶���    ������Ϊ�����ֿ���Ϊջ
 * 		ArrayDeque ʵ������
 * 
 * 
 */


//ArrayDeque��Ϊջ
public class Zhan{
	public static void main(String[] args) {
		ArrayDeque<String> stack = new ArrayDeque<>();
		//���ν�3��Ԫ��push��ջ
		stack.push("���java����");
		stack.push("������java ee��ҵ��Ӧ��ʵս");
		stack.push("���android����");
		
		System.out.println(stack);
		
		//pop����һ��Ԫ��
		System.out.println(stack.pop());
		System.out.println(stack);
	}
	
}
