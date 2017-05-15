package com.bao.interrupt;
/*
 * ����Thread�����ϵ���isInterrupted��������̵߳��ж�״̬��
 * �߳�һ�����ж�isInterrupted������᷵��true����һ��sleep�����׳�
 * �쳣����������жϱ�־����ʱisInterrupted����������false
 */
public class InterruptCheck {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("point a: isInterrupted = "+t.isInterrupted());
		t.interrupt();
		System.out.println("point b: isInterrupted = "+t.isInterrupted());
		System.out.println("point c:isInterrupted = "+t.isInterrupted());
		try{
			Thread.sleep(2000);
			System.out.println("not interrutped");
		}catch(InterruptedException e){
//			e.printStackTrace();
		}
		//�׳��쳣�������жϱ�־������᷵��false
		System.out.println("point d: t.isInterrupted()="+t.isInterrupted());
	}
}
