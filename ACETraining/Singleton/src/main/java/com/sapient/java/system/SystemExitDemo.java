package com.sapient.java.system;

public class SystemExitDemo {

	public static void main(String[] args) {
		MySecurityManager secManager = new MySecurityManager();
	    System.setSecurityManager(secManager);

	    try {
	    	System.out.println("SystemExitDemo.main()");
	    	 
	       System.exit(1);
	    }
	    catch (SecurityException e) {
	       System.out.println("SystemExitDemo.main() ");
	    }

	}

}

class MySecurityManager extends SecurityManager  {
	
	 public void checkExit(int status) {
		    System.out.println("MySecurityManager.checkExit()");
		    throw new SecurityException();
	  }
}
