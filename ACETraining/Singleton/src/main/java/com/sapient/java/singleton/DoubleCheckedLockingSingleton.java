package com.sapient.java.singleton;

public class DoubleCheckedLockingSingleton {
	
	private static volatile DoubleCheckedLockingSingleton instance; 
	
	private DoubleCheckedLockingSingleton(){
		
	}
	
	public static DoubleCheckedLockingSingleton getInstance(){
		if(null == instance){
			synchronized(DoubleCheckedLockingSingleton.class){
				//double check singleton 
				if(null==instance ){
					instance= new DoubleCheckedLockingSingleton();
				}
			}
			
		}
		return instance;
	}
	

}
