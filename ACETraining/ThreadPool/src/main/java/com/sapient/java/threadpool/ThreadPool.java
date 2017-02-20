package com.sapient.java.threadpool;

public class ThreadPool {
	
	private CustomBlockingQueue<Runnable> taskQueue;
	private boolean isPoolshutdown = false;
	
	

	public ThreadPool(int nThreads){
		
		taskQueue = new LinkedCustomBlockingQueue<Runnable>(nThreads);
		for (int i =1; i <= nThreads; i++) {
			ThreadPoolsThread threadPoolsThread=new ThreadPoolsThread(taskQueue,this);
			Thread thread = new Thread(threadPoolsThread, "Thread-"+i); 
	         System.out.println("Thread-"+i +" created in ThreadPool.");
	         thread.start();  
		}
	}
	
	public synchronized void execute(Runnable task) throws Exception{
		if(isPoolshutdown){
			throw new Exception(" Thread Pool has been shutdown");
		}
		System.out.println(" task has been added");
		taskQueue.put(task);
	}
	
	public boolean isPoolshutdown() {
		return isPoolshutdown;
	}
	
	public synchronized void shutDown(){
		isPoolshutdown= true;
		System.out.println(" thread pool shutdown initialed");
	}

}
