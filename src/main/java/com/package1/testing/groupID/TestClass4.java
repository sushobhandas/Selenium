package com.package1.testing.groupID;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.BrowserUtility;



public class TestClass4 {
	WebDriver driver;
	
	@BeforeTest
	public void beforeOpeningbrowser()
	{
		driver=BrowserUtility.chooseBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //wait for all the elements
		driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		
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
		driver.close();
	}
	
	@DataProvider
	public Object[][]generateTestData()
	{
		Object data[][]=new Object[2][2];
		data[0][0]="Lalitha";
		data[0][1]="password123";
		data[1][0]="admin";
		data[1][1]="password456";
		
		return data;
		
	}
	
	@Test(dataProvider="generateTestData")
	public void openchrome(String a, String b) throws InterruptedException
	{
		
		//driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	
		
		WebDriverWait wait;
		wait=new WebDriverWait(driver,300);
		WebElement SigninLink= driver.findElement(By.linkText("SignIn"));
		SigninLink.click();
		driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys(a);
		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("password")).sendKeys(b);
		driver.findElement(By.name("Login")).click();
		driver.navigate().to("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
		
		
		WebElement SignoutLink= driver.findElement(By.partialLinkText("SignOut"));
		SignoutLink.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
//wait.untill(ExpectedConditions.textToBePresentInElement(element, text)
	//ait.untill(ExpectedConditions.elementToBeClickable(locator)
		
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
