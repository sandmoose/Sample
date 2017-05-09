package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseCommands {
	
	
	public WebDriver getWebDriver()
	{
		return BaseTest.driver;
	}
	
	public void getUrl(String url)
	{
		getWebDriver().get(url);
	}
	
	public void sendKeys(By by, String text)
	{
		findElement(by).sendKeys(text);
	}
	
	public WebElement findElement(By by)
	{
		return getWebDriver().findElement(by);
	}
	
	public void click(By by)
	{
		getWebDriver().findElement(by).click();
	}
	
	public boolean elementExists(By by)
	{
		try{
			findElement(by);
			return true;
		} catch(Exception e){
			return false;
		}
	}

}
