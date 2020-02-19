package com.package1.testing.groupID;

import java.util.List;

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



public class TestClass2 {
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
	
		Actions act=new Actions(driver);
		act
		.keyDown(Keys.SHIFT)
		.click(driver.findElement(By.cssSelector("a[href='login.htm']")))
		.keyUp(Keys.SHIFT).build().perform();
//		
		
		
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

