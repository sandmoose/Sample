package com.map;

import org.openqa.selenium.By;

import com.utils.BaseCommands;

public class LoginMap extends BaseCommands{
	
	public By userName()
	{
		return By.name("userName");
	}
	
	public By password()
	{
		return By.name("password");
	}
	
	public By loginButton()
	{
		return By.name("login");
	}
	
	public By homePagePassengerCount()
	{
		return By.name("passCount");
	}

}
