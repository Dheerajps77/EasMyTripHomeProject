package com.QA.EasMyTrip.TestPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleFlow {

WebDriver driver;


	@BeforeTest
	public void Openingbroswer() {
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver-v0.20.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=0)
	public void Login()
	{
		driver.get("https://www.easemytrip.com/");
	}
	
	
	@Test(priority=0)
	public void AgentLocationPage()
	{

	System.out.println("I am in AgentLocationPage");
	}
	
	@Test(priority=0)
	public void PaymentPage()
	{

	System.out.println("I am in PaymentPage");
	}
	
	@Test(priority=0)
	public void RecieverPage()
	{

	System.out.println("I am in RecieverPage");
	}
	
	
}
