package com.cg;


import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class TestDemoCase {

//	RED- GREEN-REFACTOR
	
	@Test
	public void test3(){
		Assert.fail("Not yet implemented");
	}
	
	
	
	@Test
//	@Ignore
	public void test() {
		String message1 = "This is a test";
		String message2 = new String("This is a test");
		
//		message1 = null;
		
		Assert.assertEquals(true, message1.equals(message2));
		
		Assert.assertEquals(12, "12");
		
		
//		fail("Not yet implemented");
	}

	@Test
	public void test2(){
		String message2 = new String("This is a test");

		message2 = "This is a test";
		Assert.assertSame("This is a test", message2);
		
		int distance = -90;
		
		Assert.assertTrue("distance cannot be negative",distance > 0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
