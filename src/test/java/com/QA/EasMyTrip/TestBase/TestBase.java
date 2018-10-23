package com.QA.EasMyTrip.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	
	String chromepath = System.getProperty("user.dir") + "/BrowserFolder/chromedriver.exe";
	String ffpath = System.getProperty("user.dir") + "/BrowserFolder/geckodriver.exe";
	String iepath = System.getProperty("user.dir") + "/BrowserFolder/IEDriverServer.exe";
	protected WebDriver driver;

	@BeforeTest()
	public void OpeningBrowser() 
	{
		System.setProperty("webdriver.gecko.driver", ffpath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");		
	}
	@AfterTest
	public void ClosingBroswer()
	{
		driver.close();
	}


}
