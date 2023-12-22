package com.testing.basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void openBrowser(String browser) {
		if(browser=="chrome") {
			driver = new ChromeDriver();
		}
		
		if(browser=="Firefox") {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
	}

}
