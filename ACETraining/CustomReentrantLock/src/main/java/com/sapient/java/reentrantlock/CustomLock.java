/**
 * 
 */
package com.sapient.java.reentrantlock;

/**
 * @author nrai6
 *
 */
public interface CustomLock {
	
	void lock();
	void unlock();
	boolean tryLock();

}
