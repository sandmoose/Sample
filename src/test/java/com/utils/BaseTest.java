package com.utils;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;

public class BaseTest {
	
	protected static WebDriver driver;
	int implicitWait = 30;
	int explicitWait = 30;
	
	@BeforeSuite(alwaysRun=true)
	public void begin()
	{
		//code to initialize
	}
	
	@BeforeMethod(alwaysRun=true)
	@Parameters({"browser"})
	public void setup(String browser)
	{
		getDriver(browser);
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown()
	{
		driver.quit();
	}
	
	protected void getDriver(String browser)
	{
		if(browser.equals("FF")) {
			FirefoxDriverManager.getInstance().setup();
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			ChromeDriverManager.getInstance().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("internetexplorer") || browser.equalsIgnoreCase("IE")) {
			InternetExplorerDriverManager.getInstance().setup();
			driver = new InternetExplorerDriver();
		}
	}
}
