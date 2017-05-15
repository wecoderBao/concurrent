package com.bao.interrupt;

import java.util.Scanner;
/*
 * 休眠的线程被中断，会相当友好地终止线程，并抛出InterruptedException异常。另外一种情况
 * ，如果线程在调用sleep方法前被中断，那么该中断称为待决中断，它会在刚调用sleep方法时，立即抛出
 * InterruptedException异常。
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
