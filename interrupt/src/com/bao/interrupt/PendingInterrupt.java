package com.bao.interrupt;

import java.util.Scanner;
/*
 * ���ߵ��̱߳��жϣ����൱�Ѻõ���ֹ�̣߳����׳�InterruptedException�쳣������һ�����
 * ������߳��ڵ���sleep����ǰ���жϣ���ô���жϳ�Ϊ�����жϣ������ڸյ���sleep����ʱ�������׳�
 * InterruptedException�쳣��
 */
public class PendingInterrupt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String command = in.nextLine();
		if("interrupt".equals(command)){
			Thread.currentThread().interrupt();
		}
		long startTime = System.currentTimeMillis();
		try{
			Thread.sleep(2000);
			System.out.println("not interrupted");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		in.close();
		System.out.println("elapsedTime="+(System.currentTimeMillis()-startTime));
	}
}
