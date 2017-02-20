package com.sapient.java.countdownlatch;

public class CustomCountDownLatchTest {

	public static void main(String[] args) {
		
		CustomCountDownLatch countDownLatch = new CustomCountDownLatch(3);
		
		new Thread(new MyRunnable(countDownLatch), " Thread -1 ").start();
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" Reached 0 "+ Thread.currentThread().getName());
	}

}
