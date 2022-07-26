package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.CommonUtils;

public class Homepage {
	
	private static Homepage homepageInstance;
	
	private Homepage() {
		
	}
	public static Homepage getInstance() {
		
		if(homepageInstance==null) {
			homepageInstance=new Homepage();
		}
		return homepageInstance;
		
	}
	
	@FindBy(linkText="Directory")
	private WebElement DIRECTORY;
	
	
	@FindBy(linkText="Time")
	private WebElement TIME;
	
	

//	public WebElement getDIRECTORY() {
//		return DIRECTORY;
//	}
	
	public void clickDirectory() {
		CommonUtils.getInstance().highlightElement(DIRECTORY);
		DIRECTORY.click();
	}
	
	public void clickTime() {
		CommonUtils.getInstance().highlightElement(TIME);
		TIME.click();
	}
	
	

}
