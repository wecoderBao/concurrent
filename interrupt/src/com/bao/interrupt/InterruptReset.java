package com.bao.interrupt;
/*
 * interrupted������鵱ǰ�̵߳��ж�״̬����ʿ����Ϊfalse
 * ���䣺join�������̶߳�����ã������һ���߳�A�е�����һ���߳�B��join������
 * �߳�A����ȴ��߳�Bִ����Ϻ���ִ��
 * yield����ֱ����Thread����ã�yield�ó�cpuִ��Ȩ��ͬ�ȼ����̣߳����û��
 * ��ͬ������߳��ڵȴ�CPU��ִ��Ȩ������̼߳���ִ�С�
 */
public class InterruptReset {
	public static void main(String[] args) {
		System.out.println("a:"+Thread.interrupted());
		Thread.currentThread().interrupt();
		System.out.println("b:"+Thread.interrupted());
		System.out.println("c:"+Thread.interrupted());
	}
}
