package com.bao.interrupt;

public class SleepInterrupt implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("in run - about to sleep for 20s");
			Thread.sleep(20000);
			System.out.println("in run - wake up");
		}catch(InterruptedException e){
			System.out.println("in run - interrupted while sleeping");
			//return;
		}
		System.out.println("in run - leaving normally");
	}
	
	public static void main(String[] args) {
		SleepInterrupt si = new SleepInterrupt();
		Thread t = new Thread(si);
		t.start();
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("in main - interrupt other thread");
		t.interrupt();
		System.out.println("in main - leaving");
	}

}
