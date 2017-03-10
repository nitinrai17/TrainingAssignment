package com.sapient.java.thread;

public class ThreadYieldExample {

	public static void main(String[] args) {
		Thread t1= new Thread(new Thread1(),"T1");
		Thread t2= new Thread(new Thread2(),"T2");
		t1.start();
		t2.start();
	}

}

class Thread1 implements Runnable{

	public void run() {
		for (int i = 0; i < 1000000; i++) {
//			System.out.println(Thread.currentThread().getName()+" : "+i);
			if(i==10000){
				Thread.yield();
				System.out.println(Thread.currentThread().getName()+" : "+i);
			}
		}
	}
}

class Thread2 implements Runnable{

	public void run() {
		for (int i = 0; i < 100000; i++) {
			
		}
	}
}