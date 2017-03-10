package com.sapient.java.thread;

public class DeadLockExample {
	
	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		Thread t1 = new Thread(new SysThread(obj1, obj2), "T1");
		Thread t2 = new Thread(new SysThread(obj2, obj3), "T2");
		Thread t3 = new Thread(new SysThread(obj3, obj1), "T3");
		
		t1.start();
		Thread.sleep(2000);
		t2.start();
		Thread.sleep(2000);
		t3.start();
		Thread.sleep(2000);
	}
	

}


class SysThread implements Runnable{
	
	private Object obj1;
	private Object obj2;
	
	
	public SysThread(Object obj1, Object obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name +" aquiring lock on  "+obj1);
		synchronized (obj1) {
			System.out.println(name +" aquired lock on "+obj1);
			work();
			System.out.println(name +" aquiring lock on "+obj2);
			synchronized (obj2) {
				System.out.println(name +" aquired lock on "+obj1);
				work();
			}
			System.out.println(name +" release  lock on "+obj2);
		}
		System.out.println(name +" releasing lock on "+obj1);
		System.out.println(name +" aquiring lock on "+obj2);
	}

	private void work() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
