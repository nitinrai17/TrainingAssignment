/**
 * 
 */
package com.sapient.java.thread;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * @author nrai6
 *
 */
public class ThreadExample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new Runner());
		t1.setName(" T1");
		UncaughtExceptionHandler ueh = new UncaughtExceptionHandler() {
			
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(" Exception  -- "+ t.currentThread().getName() +" : "+ e.getMessage()); 
				
			}
		};
		Thread.setDefaultUncaughtExceptionHandler(ueh);
//		t1.setDaemon(true);
		t1.start();
//		t1.join();
//		Thread.yield();
		System.out.println(" End of the main thread ");
	}

}
