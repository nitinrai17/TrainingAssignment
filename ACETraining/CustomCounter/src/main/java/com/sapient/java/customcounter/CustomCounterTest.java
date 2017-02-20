package com.sapient.java.customcounter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author nrai6
 *
 */
public class CustomCounterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		for(int i =0; i < 100 ; i++){
		newFixedThreadPool.submit(new Runnable() {
			public void run() {
					System.out.println(Thread.currentThread().getName() +" :" + CustomCounter.incrementCounter());
				}
			}
		);
		}
	}

}
