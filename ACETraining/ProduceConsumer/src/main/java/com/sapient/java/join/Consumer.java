package com.sapient.java.join;

/**
 * @author nrai6
 *
 */
public class Consumer implements Runnable {

	private int n;
	private Buffer consumerBuf;
	
	public Consumer(int n , Buffer consumerBuf){
		this.n = n;
		this.consumerBuf=consumerBuf;
	}
	
	public void run() {
		int value;
		for (int i = 0; i < n; i++) {
			try {
				value= consumerBuf.get();
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}

	}

}
