package com.sapient.java.reentrantlock;

/**
 * @author nrai6
 *
 */
public class MyRunnable implements Runnable {

	private CustomLock customLock;
	
	MyRunnable (CustomLock customLock){
		this.customLock = customLock;
	}
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" is waiting to acquire lock");
		customLock.lock();
		System.out.println(Thread.currentThread().getName()
           		+" has acquired LockCustom.");
		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()
              		+" is sleeping.");
		} catch (Exception e) {
			
		}
		System.out.println(Thread.currentThread().getName()
           		+" has released LockCustom.");
		customLock.unlock();
		

	}

}
