package com.sapient.java.thread;

public class ThreadMemoryModelExample {

	public static void main(String[] args) throws InterruptedException {
		SomeObject so = new SomeObject();
		Thread t1 = new Thread(new Thread10(so),"T1");
		Thread t2 = new Thread(new Thread20(so),"T2");
		t1.start();
		Thread.sleep(5000);
		t2.start();
		

	}

}


class SomeObject {
	
	volatile boolean flag = false;
	
	public void running(){
		System.out.println(" starrt the thread ");
		while(!flag){
			System.out.println(" looping");
		}
		System.out.println(" End of the Thread");
	}
	
	public void setFlag(){
		flag =true;
		System.out.println(" Flag set ="+ flag);
	}
}


class Thread10 implements Runnable{
	
	private SomeObject so;
	public Thread10(SomeObject so ) {
		this.so=so;
	}

	public void run() {
		
		so.running();
	}
	
}


class Thread20 implements Runnable{
	
	private SomeObject so;
	public Thread20(SomeObject so) {
		this.so=so;
	}

	public void run() {
		so.setFlag();
	}
	
}