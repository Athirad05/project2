package com.stepdef;

import com.constants.Constants;
import com.page_objects.Loginpage;
import com.utils.CommonUtils;
import com.webdriver_manager.DriverManager;

import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class Common_Step_Definition {
	
	private static String scenarioName=null;
	
	public static String getScenarioName() {
		return scenarioName;
		
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		try {
			scenarioName=scenario.getName();
			
			CommonUtils.getInstance().loadProperties();
			if(DriverManager.getDriver()==null) {
			DriverManager.launchBrowser();
			CommonUtils.getInstance().initWebElements();
			login();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void login() {
		   DriverManager.getDriver().get(Constants.APP_URL);
		   Loginpage.getInstance().enterUserName(Constants.USERNAME);
		   Loginpage.getInstance().enterPassword(Constants.PASSWORD);
		   Loginpage.getInstance().clickLoginButton();	
	}
}
	


