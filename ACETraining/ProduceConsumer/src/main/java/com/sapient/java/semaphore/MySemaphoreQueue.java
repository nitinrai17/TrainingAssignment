package com.sapient.java.semaphore;

import java.util.concurrent.Semaphore;

public class MySemaphoreQueue {
	
	static Semaphore  producerSem= new Semaphore(1);
	static Semaphore  consumerSem= new Semaphore(0);
	
	int productId;
	
	public void putIntoQ(int p){
		try {
			producerSem.acquire();
			this.productId=p;
			System.out.println(Thread.currentThread().getName()+" put in Q : = "+ p);
			consumerSem.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public int getIntoQ(){
		try {
			consumerSem.acquire();
			System.out.println(Thread.currentThread().getName()+" get from Q : = "+ productId);
			producerSem.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return productId;
	}

}
