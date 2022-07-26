package com.stepdef;

import org.junit.Assert;

import com.page_objects.Homepage;
import com.page_objects.Timesheetpage;
import com.utils.CommonUtils;
import com.webdriver_manager.DriverManager;

import cucumber.api.java.en.*;

public class Verifytimesheet {

	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		try {
		String url =DriverManager.getDriver().getCurrentUrl();
	    System.out.println(url);
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}

	@When("the user clickson the time option from the menu")
	public void the_user_clickson_the_time_option_from_the_menu() {
		try {
		Homepage.getInstance().clickTime();
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	    
	}
	
	@When("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String name) {
		try {

	    Timesheetpage.getInstance().enterEmpName(name);
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}
	}


	
	

	@Given("clicks on the view button")
	public void clicks_on_the_view_button() {
		
		try {
		Timesheetpage.getInstance().clickView();
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}
	}

	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String expectedName) {
	
		try {
		String name = Timesheetpage.getInstance().getMessage();
	    System.out.println(name);
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
			Assert.fail(e.getMessage());
		}
	}
	
	
}
