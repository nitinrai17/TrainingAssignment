package com.sapient.java.semaphore;

public class Consumer implements Runnable {
	
	MySemaphoreQueue mySemaphoreQueue;
	
	Consumer(MySemaphoreQueue mySemaphoreQueue){
		this.mySemaphoreQueue= mySemaphoreQueue;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			mySemaphoreQueue.getIntoQ();
		}
	}

}
