package com.sapient.java.semaphore;

/**
 * @author nrai6
 *
 */
public class Producer implements Runnable{
	
	MySemaphoreQueue mySemaphoreQueue;
	
	Producer(MySemaphoreQueue mySemaphoreQueue){
		this.mySemaphoreQueue = mySemaphoreQueue;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			mySemaphoreQueue.putIntoQ(i);;
		}
		
	}
}
