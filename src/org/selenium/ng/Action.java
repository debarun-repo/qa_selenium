package org.selenium.ng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Web Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		String url="https://www.google.com";
		driver.get(url);	/*	driver.get("www.google.com");
		Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.id("abc"))).build().perform();
		//actions.clickAndHold(driver.findElement(By.id("abc"))).moveToElement(driver.findElement(By.id("abc"))).release().build().perform();
		//actions.sendKeys(Keys.ENTER);
		actions.keyDown(Keys.SHIFT);
		
		String parentwindow= driver.getWindowHandle();
		
		Set<String> handlers =driver.getWindowHandles();
		Iterator<String> iterate = handlers.iterator();
		while(iterate.hasNext())
		{
			String temp =iterate.next();
			if(temp==parentwindow)
			{
				driver.switchTo().window(parentwindow);
				break;
			}
		}
		
	}
*/
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.className("abc")));
	
}
}
