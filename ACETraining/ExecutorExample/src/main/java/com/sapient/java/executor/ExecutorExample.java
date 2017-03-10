package com.sapient.java.executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
	
	
	public static void main(String[] args) {
		int[] intarr= new int[1000] ;
		int start=0;
		int offset=1000;
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
		newFixedThreadPool.submit(new SerachNumber(intarr));
//		split(intarr, start, offset);
		
		
	}

}


class SerachNumber<Integer> implements Callable<Integer>{
	
	private int[] intarr;
	
	
	public SerachNumber(int[] intArray){
		this.intarr=intArray;
	}


	public Integer call() throws Exception {
		
		Arrays.sort(intarr);
		int index = Arrays.binarySearch(intarr,98);
		System.out.println(" "+intarr[98]);
		if( index >=0){
			return (Integer) new java.lang.Integer(index);
		}
		return null;
	}
	
}


class Split {
	
	int start =0 ;
	int offset=1000;
	List list = new ArrayList();
	
	public void split(int[] arr, int start, int offset ) {
		
		list.add(Arrays.copyOfRange(arr, start, offset));
		
		
	}
	
}


