package com.bao.interrupt;
/*
 * 可在Thread对象上调用isInterrupted方法检查线程的中断状态。
 * 线程一旦被中断isInterrupted方法便会返回true，而一旦sleep方法抛出
 * 异常，他将清空中断标志，此时isInterrupted方法将返回false
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
		//抛出异常后会清除中断标志，这里会返回false
		System.out.println("point d: t.isInterrupted()="+t.isInterrupted());
	}
}
