package com.sapient.java.threadpool;

public class ThreadPoolsThread implements Runnable{
	
	private CustomBlockingQueue<Runnable> taskQueue;
	private ThreadPool threadPool;
	
	public ThreadPoolsThread(CustomBlockingQueue<Runnable> queue, ThreadPool threadPool){
		this.taskQueue = queue;
		this.threadPool= threadPool;
	}

	public void run() {
		try {
			while(true){
				System.out.println(Thread.currentThread().getName() + " Ready for execute task ");
				Runnable runnable = taskQueue.take();
				System.out.println(Thread.currentThread().getName() + " has taken task" );
				runnable.run();
				System.out.println(Thread.currentThread().getName() + " has Executed task" );
				if(threadPool.isPoolshutdown() ){
					Thread.currentThread().interrupt();
					Thread.sleep(1);
				}
			}
		} catch (Exception e) {
			System.out.println( Thread.currentThread().getName()+ " has been stop");
		}
	}

}
