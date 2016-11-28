package com.automation.facebook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class WebDriverFactory {

	private static WebDriver driver = null;
	private static final String FBurl = "https://www.facebook.com/";
//	private static final String Amazonurl = "www.amazon.com";

	@BeforeClass
	public void initializeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(FBurl);

		// System.setProperty("webdriver.ie.driver","C://Selenium//IEDriverServer.exe");
		// driver = new InternetExplorerDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get(FBurl);
	}

	public static void setDriver(WebDriver driver) {
		WebDriverFactory.driver = driver;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
		return driver;
	}



	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.close();
		}
	}

}
