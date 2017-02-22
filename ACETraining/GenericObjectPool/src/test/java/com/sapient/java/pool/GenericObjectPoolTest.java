package com.sapient.java.pool;

import junit.framework.TestCase;

public class GenericObjectPoolTest extends TestCase {

	private GenericObjectPool<Object> pool; 
	
	private int size=10;
	
	private ObjectFatory objectFatory;
	
//	@before 
	protected void setUp() throws Exception {
		objectFatory  = new ObjectFatory();
		pool = new GenericObjectPool<Object>(size, objectFatory);
		pool.initilized();
		
		
	}
	
	
	public void testTakeAllObject() throws InterruptedException{
		for(int i=0; i<size; i++){
			Object obj = pool.takeObject();
			assertNotNull(obj);
		}
	}
	
//	@Test
	public void testTakeObject() throws InterruptedException{
		Object obj = pool.takeObject();
		assertNotNull(obj);
		
	}
	
	public void testPutObject() throws InterruptedException{		
		pool.putObject(objectFatory.createObject());
		
	}
	
	private  class ObjectFatory implements IGeneric<Object>{

		public Object createObject() {
			return new Object();
		}
		
	}

}
