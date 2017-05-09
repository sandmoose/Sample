package com.tests;

import org.testng.annotations.Test;

import com.page.LoginPage;
import com.utils.BaseTest;

public class LoginTests extends BaseTest{
	
	LoginPage loginPage = new LoginPage();
	
	@Test(groups={"login"})
	public void loginTests()
	{
		loginPage.assertLogin("http://newtours.demoaut.com", "mercury", "mercury");
	}

}
