package com.package1.testing.groupID;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.BrowserUtility;

public class TestClass04 {
	








		WebDriver driver;
		
		@BeforeTest
		public void beforeOpeningbrowser()
		{
			driver=BrowserUtility.chooseBrowser("Chrome");

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
//			
//			
//			driver.get("http://demo.guru99.com/test/delete_customer.php");
//			WebElement custId=driver.findElement(By.name("cusid"));
//			custId.sendKeys("23874");
//			driver.findElement(By.name("submit")).click();
//			if(ExpectedConditions.alertIsPresent()!=null)
//			{
//				//confirmation window
//				Alert a = driver.switchTo().alert();
//				a.accept();
//				//a.dismiss();
//				
//				Thread.sleep(4578);
//				
//				//alert
//				Alert a1 = driver.switchTo().alert();
//				a1.accept();
//				
//				
//				//prompt
//				Alert a2 = driver.switchTo().alert();
//				a2.sendKeys("Here is my msg");
//				a2.accept();
//				a2.dismiss();
//				
//			}
			
			
			
//			if(ExpectedConditions.alertIsPresent()!=null)
//			{
//				Alert a = driver.switchTo().alert();
//				a.accept();
//				//a.dismiss();
//			}
//			
			
			
			
			
			
			
			
			
			
			//driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
//important1:-
//			driver.get("http://172.31.36.202:443/TestMeApp/RegisterUser.htm");
//		WebElement securitymenu=	driver.findElement(By.cssSelector("select#securityQuestion"));
//		Select s1=new Select(securitymenu);
//		
//		s1.selectByIndex(2);
//		Thread.sleep(5200);
//		s1.selectByVisibleText("What is your Nick Name?");
//		Thread.sleep(4000);
//		s1.selectByValue("411011");
		
		
			//Important:-
						driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
			Actions act=new Actions(driver);
			//act.keyDown(Keys.SHIFT).click(driver.findElement(By.cssSelector("a[href='login.htm']"))).keyUp(Keys.SHIFT).build().perform();
//			
			act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]")));
			act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our')]")));
			act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]")));
			act.click().build().perform();
//			
			Set<String> allWindow=driver.getWindowHandles();
			for(String w: allWindow)
			{
				driver.switchTo().window(w);
			}
			
//			Set<String> allWindow1=driver.getWindowHandles();
//			for(String w: allWindow1)
//			{
//				driver.switchTo().window(w);
//			}
//			
//			act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]")));
//			act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our')]")));
//			act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]")));
//			act.click().build().perform();
			
		}
	//	
	//	
	//	
		@Test
		public void betchallLinks()
		{
//			 driver.findElement(By.cssSelector("a[href='login.htm']")).click();
//			 
//			 driver.findElement(By.cssSelector("input#userName")).sendKeys("Lalitha");
//			 driver.findElement(By.cssSelector("input#password")).sendKeys("password123");
//			 driver.findElement(By.cssSelector("input[value='Login']")).click();
//			 
//			 driver.findElement(By.cssSelector("a[href='logout.htm']")).click();
			 
		
			 
			

			
			
		
		}
	}





