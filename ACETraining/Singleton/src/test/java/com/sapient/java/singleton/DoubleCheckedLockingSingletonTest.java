/**
 * 
 */
package com.sapient.java.singleton;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author nrai6
 *
 */
public class DoubleCheckedLockingSingletonTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test 
	public void testDoubleCheckedLockingSingleton (){
		DoubleCheckedLockingSingleton dcls = DoubleCheckedLockingSingleton.getInstance();
		
		DoubleCheckedLockingSingleton dclsInstance  = DoubleCheckedLockingSingleton.getInstance();
		
		DoubleCheckedLockingSingleton dclsInstance2  = DoubleCheckedLockingSingleton.getInstance();
		System.out.println("dcls ="+ dcls + " : dclsInstance ="+dclsInstance + " : dclsInstance2 ="+dclsInstance2);
		assertEquals(dcls, dclsInstance);
		assertEquals(dcls, dclsInstance2);
		assertEquals(dcls, dclsInstance);
		
	}

}
