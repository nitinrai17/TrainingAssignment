package com.sapient.java.reentrantlock;

public class CustomReentrantLock implements CustomLock {
	
	int lockHoldCount;
	
	long holdingLockId; 
	
	CustomReentrantLock(){
		lockHoldCount =0;
	}

	public synchronized void lock() {
		
		if(lockHoldCount ==0 ){
			lockHoldCount++;
			holdingLockId = Thread.currentThread().getId();
		} else if(lockHoldCount >0 && holdingLockId==Thread.currentThread().getId()) {
			lockHoldCount++;
		}else {
			try {
				wait();
				lockHoldCount++;
				holdingLockId = Thread.currentThread().getId();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

	public synchronized void unlock() {
		if(lockHoldCount ==0 ){
			throw new IllegalMonitorStateException();
		}
		lockHoldCount--;
		if(lockHoldCount ==0) notify();
		

	}

	public synchronized boolean tryLock() {
		
		if(lockHoldCount ==0){
			lock();
			return true;
		}else {
			return false;
		}
	}

}
