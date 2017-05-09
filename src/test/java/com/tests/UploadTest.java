package com.tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class UploadTest {
	
	@Test(groups="upload")
	public void uploadTest()
	{
		File file = new File(".");
		System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\.");
		System.out.println(System.getProperty("user.home"));
		System.out.println(file.getAbsolutePath());
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir").concat("\\src\\test\\resources\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
	}
}
