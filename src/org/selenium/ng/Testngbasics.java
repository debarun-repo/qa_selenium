package org.selenium.ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngbasics {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Test");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

	}

	@Test(invocationCount = 2,expectedExceptions = ArithmeticException.class)
	public void LoginTest() {
		int i = 9 / 0;
		System.out.println(i);
	}

	@Test(dependsOnMethods  = "LoginTest")

	public void SearchTest() {
		System.out.println("Search Test");
	}

	@Test(dependsOnMethods = "LoginTest")
	public void Test1() {
		System.out.println("Test1");
	}

	@AfterMethod
	public void closeConnection() {
		driver.close();
	}
}
