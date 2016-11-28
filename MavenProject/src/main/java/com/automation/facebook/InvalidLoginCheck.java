package com.automation.facebook;

import org.openqa.selenium.By;

public class InvalidLoginCheck extends WebDriverFactory {
	
	
	public void Login(){
		getDriver().findElement(By.id("email")).sendKeys("vinodAvulapati");
		
	}

}
