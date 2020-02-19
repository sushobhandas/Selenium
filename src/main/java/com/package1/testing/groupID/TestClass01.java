package com.package1.testing.groupID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.BrowserUtility;



public class TestClass01 {
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
	public void openchrome() throws InterruptedException
	{
		
		//driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
			Thread.sleep(5000);
		WebElement SigninLink= driver.findElement(By.linkText("SignIn"));
		SigninLink.click();
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		driver.navigate().to("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		
		WebElement SignoutLink= driver.findElement(By.partialLinkText("SignOut"));
		SignoutLink.click();
		 
		
	}
//	
//	
//	
//	@Test
//	public void testmethod2()
//	{
//		System.out.println("This is test method 02");
//	}


}
