package com.sapient.java.singleton;

import junit.framework.Assert;

import org.junit.Test;

public class SingletonFactoryMethodTest {
	
	
	@Test
	public void testSingleton(){
		SingletonFactoryMethod sfm = SingletonFactoryMethod.getInstance();
		
		SingletonFactoryMethod sfm1 = SingletonFactoryMethod.getInstance();
		
		SingletonFactoryMethod sfm2 = SingletonFactoryMethod.getInstance();
		
		Assert.assertEquals(sfm, sfm1);
	}

}
