package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonUtils;

public class Directorypage {
	
	private static Directorypage directorypage;
	
	private Directorypage() {
		
	}
	
	public static Directorypage getInstance() {
		if(directorypage==null) {
			directorypage=new Directorypage();
		}
		return directorypage;
	}
	@FindBy(id="searchDirectory_job_title")
	private WebElement JOB_TITLE;
	
	
	@FindBy(id="searchBtn")
	private WebElement SEARCH;
	
	@FindBy(xpath="//b[text()='John Smith']")
	private WebElement NAME;

//	public WebElement getJOB_TITLE() {
//		return JOB_TITLE;
//	}
//
//	public WebElement getSEARCH() {
//		return SEARCH;
//	}
//
//	public WebElement getNAME() {
//		return NAME;
//	}
	
	public void selectJobTitle(String JobRole) {
		CommonUtils.getInstance().highlightElement(JOB_TITLE);
		Select select = new Select(JOB_TITLE);
		select.selectByVisibleText(JobRole);
	}
	
	public void clickSearch() {
		CommonUtils.getInstance().highlightElement(SEARCH);
		SEARCH.click();
	}
	
	public String getPersonalName() {
		CommonUtils.getInstance().highlightElement(NAME);
		return NAME.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
