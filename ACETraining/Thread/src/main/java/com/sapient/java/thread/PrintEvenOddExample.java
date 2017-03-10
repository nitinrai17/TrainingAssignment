package com.sapient.java.thread;


public class PrintEvenOddExample {

	
	public static void main(String[] args) {
		final int[] arrayint= {1,2,3,4,5,6,7};
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				new Odd(arrayint).running();;
				
			}
		}, "T1");
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				new Even(arrayint).running();
			}
		}, "T2");
		t1.start();
		t2.start();
	}
}


class Even {

	private int[] number ;
	boolean isPrintEven=false;
	
	public Even(int [] num) {
		this.number= num;
		
	}
	
	public synchronized void running() {
		int i=1;
		while(i < number.length){
			try {
					System.out.println(Thread.currentThread().getName()+" Even: "+number[i] );
					if(isPrintEven){
						number.wait();
					}else{
						
					}
					i++;
					isPrintEven=false;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			i=i+2;
			number.notify();
		}
			
		
	}
	
	
}

class Odd {

	private int[] number ;
	
	public Odd(int [] num) {
		this.number= num;
	}
	
	public synchronized void running() {
		int i=0;
		while(i < number.length  ){
			System.out.println(Thread.currentThread().getName()+" Odd: "+number[i] );
			number.notify();
			i=i+2;
			try {
				number.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
	}
	
	
}
