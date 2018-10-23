package com.QA.EasMyTrip.TestPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel {
	
	
	WebDriver driver;
	
	public SearchHotel(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//div[@class='emt_nav']//ul//li[2]//a")
	WebElement HotelButton;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//input[@id='txtCity']")
	WebElement txtCity;
	
	@CacheLookup
	@FindBy(how=How.XPATH, using="//ul[@id='ui-id-1']//li[5]//div[@id='ui-id-36']")
	WebElement SelectCity;
	
	
	public void ClickOnHotelButton()
	{
		HotelButton.click();
	}
	
	public void EnterCityName() throws InterruptedException
	{
		Thread.sleep(3000);
		txtCity.sendKeys("goa ");
		Thread.sleep(4000);
		SelectCity.click();
	}

}
