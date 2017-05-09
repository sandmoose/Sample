package com.page;

import com.map.LoginMap;

public class LoginPage extends LoginMap {
	
	public void assertLogin(String url, String username, String password)
	{
		getUrl(url);
		sendKeys(userName(),username);
		sendKeys(password(), password);
		click(loginButton());
		elementExists(homePagePassengerCount());
	}
}
