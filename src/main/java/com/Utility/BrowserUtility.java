package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	static WebDriver driver;
	public static WebDriver chooseBrowser(String browsername)
	{
	
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browsername.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.Geko.driver", "C:\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.internetexplorer.driver", "C:\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Browser is not present on system");
		}
		
		return driver;
	}

}
