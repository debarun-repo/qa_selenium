package org.selenium.ng;

import org.testng.annotations.Test;

public class ExceptionTimeOut {

	
	@Test(timeOut = 2, expectedExceptions = ArithmeticException.class)
	public void Test()
	{
	int i=9/0;
	System.out.println(i);
	}
}
