package com.sapient.java.join;

/**
 * @author nrai6
 *
 */
public class Producer implements Runnable {

	private int n;
	private Buffer producerBuf;
	
	public Producer(int n , Buffer producerBuf){
		this.n=n;
		this.producerBuf= producerBuf;
	}
	
	public void run() {
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
			try {
				producerBuf.put(i+1);
			} catch (Exception e) {
				return;
			}
		}

	}

}
