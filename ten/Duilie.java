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

//ArrayDeque��Ϊ����
public class Duilie {
	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<>();
		
		//offer�Ƕ��з������ὫԪ�ؼӵ�����β��
		queue.offer("���java����");
		queue.offer("������java ee��ҵӦ��ʵս");
		queue.offer("���android����");
		System.out.println(queue);
		
		//���ʶ���ͷ��Ԫ���Ҳ���ɾ��
		System.out.println(queue.peek());
		System.out.println(queue);
		
		//���ʶ���ͷ��Ԫ�ز�����ɾ��
		System.out.println(queue.poll());
		System.out.println(queue);
	}
	
}

