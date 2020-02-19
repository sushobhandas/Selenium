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



public class TestCase6 {
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
	public void a()
	{
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']")));
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText()); 
	}
		
	
	
	
//	@Test
//	public void apenchrome() throws InterruptedException
//	{
//		
//		//driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
//		driver.get("https://jqueryui.com/dialog/");
//		
//		
//		
//		//1st technique-> Index no
//		driver.switchTo().frame(0);
//		//2nd technique-> give name of the frame:
//		//driver.switchTo().frame("Name Of the frame/iframe");
//		//3nd technique-> give complete frame element
//		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//		
//		
//		driver.findElement(By.xpath("//button[@title='Close']")).click();
//		
//		//driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent(); //returning to the main page
//		driver.findElement(By.xpath("//a[@href='/resources/demos/dialog/animated.html']")).click();
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
//		
//		driver.findElement(By.cssSelector("button#opener")).click();
//		
//		
//	}
//	
	
//	
//	
//	
	@Test
	public void betchallLinks()
	{
//		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
//	
//		System.out.println(allLinks);
//		System.out.println(allLinks.size());
//		
//		for(int i=0;i<allLinks.size();i++)
//		{
//		String text=allLinks.get(i).getText();
//		System.out.println(text);
//		System.out.println(allLinks.get(i).getAttribute("href"));
//		}
	}
}

