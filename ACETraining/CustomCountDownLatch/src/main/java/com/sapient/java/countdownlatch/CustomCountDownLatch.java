package com.sapient.java.countdownlatch;

public class CustomCountDownLatch {
	
	private int countDown;
	
	public CustomCountDownLatch(int countDown){
		this.countDown= countDown;
	}
	
	public synchronized void await() throws InterruptedException{
		if(countDown> 0) this.wait();
	}
	
	public synchronized void countDown(){
		countDown--;
		if(countDown==0){
			this.notifyAll();
		}
	}

}
