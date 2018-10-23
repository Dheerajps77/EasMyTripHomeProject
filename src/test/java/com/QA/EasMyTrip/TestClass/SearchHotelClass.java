package com.QA.EasMyTrip.TestClass;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.QA.EasMyTrip.TestBase.TestBase;
import com.QA.EasMyTrip.TestPage.SearchHotel;

public class SearchHotelClass extends TestBase{

	
	SearchHotel OjbSearchHotel;
	
	
	@Test(priority=0)
	public void ClickOnHotelButton()
	{
		OjbSearchHotel=PageFactory.initElements(driver, SearchHotel.class);
		OjbSearchHotel.ClickOnHotelButton();
	}
	
	@Test(priority=1)
	public void EnterCityName() throws InterruptedException
	{
		OjbSearchHotel.EnterCityName();
	}
}
