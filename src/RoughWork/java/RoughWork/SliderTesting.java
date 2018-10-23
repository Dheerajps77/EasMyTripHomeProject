package RoughWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SliderTesting {

	String chromepath = System.getProperty("user.dir") + "/BrowserFolder/chromedriver.exe";
	String ffpath = System.getProperty("user.dir") + "/BrowserFolder/geckodriver.exe";
	String iepath = System.getProperty("user.dir") + "/BrowserFolder/IEDriverServer.exe";
	WebDriver driver;

	@BeforeTest()
	@Parameters({"browser"})
	public void OpeningBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		}
		
		else if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", ffpath);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
			driver.get("https://www.easemytrip.com/");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", iepath);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
			driver.get("https://www.easemytrip.com/");

		}
	}
	
	@Test
	public void GetURL() throws InterruptedException
	{
	
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.activeCount());
	}
	
	@AfterTest
	public void ClosingBroswer()
	{
		driver.close();
	}

}





/*
 * WebElement slider=driver.findElement(By.xpath(
 * "//div[@class='lft_block']//div//ul//li[1]//a[text()='Mumbai to Delhi (BOM- DEL)']//following::a[1]"
 * )); Actions action=new Actions(driver); action.dragAndDropBy(slider,
 * 296, 180).build().perform();
 */