package com.sapient.java.threadpool;

public class CustomThreadPoolTest {

	public static void main(String[] args) throws Exception {
		ThreadPool threadPool = new ThreadPool(2);
		Runnable runnable = new Task();
		threadPool.execute(runnable);
		threadPool.execute(runnable);
		
		threadPool.shutDown();

	}

}
