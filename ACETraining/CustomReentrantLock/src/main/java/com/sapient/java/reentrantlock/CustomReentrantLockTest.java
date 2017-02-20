package com.sapient.java.reentrantlock;

public class CustomReentrantLockTest {

	public static void main(String[] args) {
		CustomLock customLock= new   CustomReentrantLock();
		MyRunnable myRunnable = new MyRunnable(customLock);
		new Thread(myRunnable,"Thread-1").start();
		new Thread(myRunnable,"Thread-2").start();
	}

}
