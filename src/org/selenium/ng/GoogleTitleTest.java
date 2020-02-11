package org.selenium.ng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Test");
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
	}

	@Test
	public void check() {
		String s = driver.getTitle();
		assertEquals(s, "Google");
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}
