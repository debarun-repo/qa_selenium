package com.selenium.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	
	@Test
	@Parameters({"url","loginid","password"})
	public void test(String url,String loginid, String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(loginid);;
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);;
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> iterate = handles.iterator();
		while(iterate.hasNext())
		{
			iterate.next();
			if(driver.findElement(By.xpath("//input[@id='email']")).getText()=="abc")
			{
				driver.findElement(By.xpath("//input[@id='abc']")).click();
				continue;
				
			}
			
			
				System.out.println();
			}
		}
	
}
