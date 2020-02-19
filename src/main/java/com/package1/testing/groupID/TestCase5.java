package com.package1.testing.groupID;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.BrowserUtility;



public class TestCase5 {
	WebDriver driver;
	
	@BeforeTest
	public void beforeOpeningbrowser()
	{
		driver=BrowserUtility.chooseBrowser("Chrome");
		
//		driver.navigate().to("https://google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "Home");
		//System.out.println(driver.getPageSource());
	}
	
	@AfterTest
	public void afterClosingbrowser()
	{
		//driver.close();
//driver.close();
		//driver.quit();
	}
	
//	
	@Test
	public void apenchrome() throws InterruptedException
	{
		
		//driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		//sign in in new window
		Actions act=new Actions(driver);
		//driver is in Home window
		act
		.keyDown(Keys.SHIFT)
		.click(driver.findElement(By.cssSelector("a[href='login.htm']")))
		.keyUp(Keys.SHIFT).build().perform();
		
		
		Set allWindows=driver.getWindowHandles(); //fetch all the windows opened by selenium(all windows object)
		String homeWindow=(String)allWindows.toArray()[0];
		String LogInWindow=(String)allWindows.toArray()[1];
		
		driver.switchTo().window(LogInWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
		driver.switchTo().window(homeWindow);
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
		
		Thread.sleep(10000);
		
		
		
		
	}
	
	
//	
//	
//	
	@Test
	public void betchallLinks()
	{
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	
		System.out.println(allLinks);
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
		String text=allLinks.get(i).getText();
		System.out.println(text);
		System.out.println(allLinks.get(i).getAttribute("href"));
		}
	}
}

