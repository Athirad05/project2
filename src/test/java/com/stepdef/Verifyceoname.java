package com.stepdef;

import com.page_objects.Directorypage;
import com.page_objects.Homepage;
import com.utils.CommonUtils;
import com.webdriver_manager.DriverManager;

import cucumber.api.java.en.*;

public class Verifyceoname {
	
	@Given("the user is logged in sucessfully and is on Home Page")
	public void the_user_is_logged_in_sucessfully_and_is_on_Home_Page() {
		try {
	   
	   
	  String url= DriverManager.getDriver().getCurrentUrl();
	  System.out.println(url);
		}catch(Exception e) {
		System.out.println(e);
		CommonUtils.getInstance().takeScreenshot();
	}
	}

	@When("the user clicks on the directory option from the Menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_Menu_bar() {
		try {
		Homepage.getInstance().clickDirectory();
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}

	@When("the user selects the job title as {string} from the drop down")
	public void the_user_selects_the_job_title_as_from_the_drop_down(String JobRole) {
	try {
		Directorypage.getInstance().selectJobTitle(JobRole);
	}catch(Exception e) {
		System.out.println(e);
		CommonUtils.getInstance().takeScreenshot();
	}
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		try {
		Directorypage.getInstance().clickSearch();
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
		}
	}

	@Then("the user should see the CEO name as {string}")
	public void the_user_should_see_the_CEO_name_as(String expectedName) {
		try {
		String name =Directorypage.getInstance().getPersonalName();
		System.out.println(name);
		}catch(Exception e) {
			System.out.println(e);
			CommonUtils.getInstance().takeScreenshot();
		}
		
	  
	}

}
