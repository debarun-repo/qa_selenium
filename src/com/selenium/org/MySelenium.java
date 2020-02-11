package com.selenium.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MySelenium {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Test");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com"); 
	    driver.manage().window().maximize();
	   WebDriverWait wait = new WebDriverWait(driver,20);
	   
	   //Explicit Wait
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='loginbutton']")));
//	   driver.findElement(By.name("email")).sendKeys("debarunnatta1995@gmail.com");
//	   driver.findElement(By.name("pass")).sendKeys("Rocky12345");
//	   driver.findElement(By.xpath("//label[@id='loginbutton']")).click(); 
	   
	  
	 //  Thread.sleep(5000);
	    //sdriver.navigate().to("https://www.flipkart.com");
//	    Thread.sleep(5000);
//	    driver.navigate().back();
//	    driver.navigate().forward();
//	   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
//	   FileUtils.copyFile(src, new File("C:\\debarun_workspace\\MySelenium\\src\\com\\selenium\\org\\abc.png"));
	  File src= new File("C:\\debarun_workspace\\MySelenium\\src\\com\\selenium\\data\\LoginDetails.xlsx");
	  FileInputStream fs = new FileInputStream(src);
	  XSSFWorkbook workbook = new XSSFWorkbook(fs);
	 

		
    
	}
	
}
