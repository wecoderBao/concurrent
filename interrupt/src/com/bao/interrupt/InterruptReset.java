package com.bao.interrupt;
/*
 * interrupted方法检查当前线程的中断状态并隐士重置为false
 * 补充：join方法用线程对象调用，如果在一个线程A中调用另一个线程B的join方法，
 * 线程A将会等待线程B执行完毕后再执行
 * yield可以直接用Thread类调用，yield让出cpu执行权给同等级的线程，如果没有
 * 相同级别的线程在等待CPU的执行权，则该线程继续执行。
 */
public class InterruptReset {
	public static void main(String[] args) {
		System.out.println("a:"+Thread.interrupted());
		Thread.currentThread().interrupt();
		System.out.println("b:"+Thread.interrupted());
		System.out.println("c:"+Thread.interrupted());
	}
}
