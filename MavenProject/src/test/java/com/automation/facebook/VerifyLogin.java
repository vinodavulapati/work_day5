package com.automation.facebook;

import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void Credentials(){
	InvalidLoginCheck obj = new InvalidLoginCheck();
	obj.initializeWebDriver();
	obj.Login();
	obj.tearDown();
	}
	
	
}
