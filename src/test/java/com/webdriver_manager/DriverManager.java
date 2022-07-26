package com.webdriver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver=null;
	
	public static void launchBrowser() {
		try {
			switch(Constants.BROWSER) {
			case"chrome":
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
				break;
			default:
				WebDriverManager.chromedriver().setup();
				driver =new ChromeDriver();
				break;
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
	

}
