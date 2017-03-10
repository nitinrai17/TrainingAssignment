package com.sapient.java.thread;

public class OddEvenPrint {

	public static void main(String[] args) {
		int[] objA = {1,2,3,4,5,6,7,8};
		Thread t1 = new Thread(new Tasker(10,objA,false)," T1");
		Thread t2 = new Thread(new Tasker(10,objA,true)," T2");
		t1.start();
		t2.start();

	}

}

class Tasker implements Runnable{

	private int size;
	private boolean isEvenPrinted= false;
	private int[] obj; 
	
	public Tasker(int size, int[] objArray, boolean isEven){
		this.isEvenPrinted=isEven;
		this.size=size;
		this.obj=objArray;
	}
	
	public void run() {
		int num = isEvenPrinted ==true ?2:1;
		
		while(num <=size){
			
				if(isEvenPrinted){
					synchronized (this) {
					while(isEvenPrinted ==false ){
						try {
			                wait();
			            } catch (InterruptedException e) {
			                e.printStackTrace();
			            }
					}
					System.out.println(Thread.currentThread().getName() + " :: " +num );
			        isEvenPrinted = false;
			        notifyAll();
					}
				}else{
					synchronized (this) {
					while(isEvenPrinted ==true ){
						try {
			                wait();
			            } catch (InterruptedException e) {
			                e.printStackTrace();
			            }
					}
					System.out.println(Thread.currentThread().getName() + " :: " +num );
			        isEvenPrinted = true;
			        notifyAll();
				}
				}
					num=num+2;
				}
		}
		
		
	}


	


