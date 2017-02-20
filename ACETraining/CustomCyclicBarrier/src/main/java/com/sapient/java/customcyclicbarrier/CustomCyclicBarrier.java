package com.sapient.java.customcyclicbarrier;

public class CustomCyclicBarrier {
	
	int initialParties;
	int partiesAwait;
	Runnable cyclicBarrierEvent;
	
	
	public CustomCyclicBarrier(int parties, Runnable cyclicBarrier ){
		this.cyclicBarrierEvent=cyclicBarrier;
		this.initialParties=parties;
		this.partiesAwait= parties;
	}
	
	public synchronized void await() throws InterruptedException{
		partiesAwait --;
		if(partiesAwait>0){
			this.wait();
		}else{
			partiesAwait= initialParties;
			notifyAll();
			cyclicBarrierEvent.run();
		}
	}
	

}
