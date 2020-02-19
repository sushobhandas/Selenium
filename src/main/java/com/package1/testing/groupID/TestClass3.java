package com.package1.testing.groupID;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.BrowserUtility;



public class TestClass3 {
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
	}
	
//	
	@Test
	public void apenchrome() throws InterruptedException
	{
		
		//driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		
		
	}
//	
//	
//	
	@Test
	public void betchallLinks()
	{
		 driver.findElement(By.cssSelector("a[href='login.htm']")).click();
		 
		 driver.findElement(By.cssSelector("input#userName")).sendKeys("Lalitha");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("password123");
		 driver.findElement(By.cssSelector("input[value='Login']")).click();
		 
		 driver.findElement(By.cssSelector("a[href='logout.htm']")).click();
		 
	
		 
		

		
		
	
	}
}

