package com.sapient.java.singleton;

public class SingletonFactoryMethod {
	
	private static final SingletonFactoryMethod instance = new SingletonFactoryMethod();
	
	private SingletonFactoryMethod(){
		
	}
	
	public static SingletonFactoryMethod getInstance(){
		return instance;
	}

}
