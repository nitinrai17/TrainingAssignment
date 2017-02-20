package com.sapient.java.countdownlatch;

public class MyRunnable implements Runnable {
	
	CustomCountDownLatch countDownLatch;
	
	public MyRunnable(CustomCountDownLatch  customCountDownLatch) {
		this.countDownLatch =customCountDownLatch; 
	}

	public void run() {
		for (int i = 2; i >=0; i--) {
			countDownLatch.countDown();
			System.out.println(Thread.currentThread().getName()+" reduce to "+i );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
