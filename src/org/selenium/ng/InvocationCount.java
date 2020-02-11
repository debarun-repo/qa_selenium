package org.selenium.ng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void TestCount()
	{
		System.out.println("abc");
	}
	
	
}
