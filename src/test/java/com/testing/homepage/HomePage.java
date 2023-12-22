package com.testing.homepage;



import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testing.basetest.BaseTest;

public class HomePage extends BaseTest {
	
	Actions actions = new Actions(driver);
	
	String desiredDate = "25";
	
	@FindBy(id = "cab_rental_vertical")
	WebElement carRental;
	
	@FindBy(id = "source")
	WebElement pickUp;
	@FindBy(id = "destination")
	WebElement destination;
	
	@FindBy(xpath = "//span[text()=Train Tickets]")
	WebElement trainTicket;
	
	
	@FindBy(id = "src")
	WebElement from;
	
	@FindBy(id = "dest")
	WebElement to;
	
	@FindBy(id = "onwardCal")
	WebElement date;
	
	@FindBy(xpath = "//div[@id='rb-calender_onward_cal']//td")
   List<WebElement> dateinputs = new ArrayList<>();
    
	
	@FindBy(xpath = "//*[@id=\"search_button\"]")
	WebElement searchBus;
	
	@FindBy(xpath = "//*[@id=\"onwardCal\"]/div/div/text[2]")
	WebElement enterdate;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public void getcar() {
		carRental.click();;
	}
	
	public void getTrainTicket() {
		trainTicket.click();
	}
	
	public void enterPickUP() {
		to.sendKeys("Hyderabad");
	}
	
	public void enterDestination() {
		from.sendKeys("Visakhapatnam");
	}
	
	public void clickDate() {
		date.click();
	}
	
	
	
	
	public void clicksearchBus() {
		searchBus.click();
	}
	
	public void enterDate() {
	//actions.click(date).build().perform();
		
		for (WebElement dateElement : dateinputs) {
			 if (dateElement.getText().equals(desiredDate)) {
			 dateElement.click();
			 break;
			 }			 }
		
		
	}
	
	


}
