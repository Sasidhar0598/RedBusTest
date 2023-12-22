package com.testing.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testing.basetest.BaseTest;
import com.testing.homepage.HomePage;

public class HomePageTest extends BaseTest{
	HomePage hp;
	@BeforeClass
	public void openApp() {
		openBrowser("chrome");
		hp = new HomePage(driver);
	}
	
	@Test
	public void homePageTest() throws InterruptedException {
		hp.getTitle();
		Thread.sleep(2000);
		hp.enterPickUP();
		Thread.sleep(2000);
		hp.enterDestination();
		Thread.sleep(2000);
		hp.clickDate();
		Thread.sleep(3000);
		hp.enterDate();
		Thread.sleep(2000);
		hp.clicksearchBus();
		
		
		
	}
	
	@AfterClass
	public void cleanUp() {
		//driver.quit();
	}

}
