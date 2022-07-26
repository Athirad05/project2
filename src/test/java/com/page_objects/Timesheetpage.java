package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Timesheetpage {
	
private static Timesheetpage timesheetpageInstance;
	
	private Timesheetpage() {
		
	}
	public static Timesheetpage getInstance() {
		
		if(timesheetpageInstance==null) {
			timesheetpageInstance=new Timesheetpage();
		}
		return timesheetpageInstance;
		
	}

	
	
	
	@FindBy(xpath="//input[@id='employee']")
	private WebElement EMPNAME;
	
	@FindBy(id="btnView")
	private WebElement VIEW;
	
	@FindBy(xpath="//div[@class='inner']//div[1]")
	private WebElement MESSAGE;
	
	
	public void enterEmpName(String name) {
//		CommonUtils.getInstance().highlightElement(EMPNAME);
		EMPNAME.sendKeys(name);
	}
	
	public void clickName() {
//		CommonUtils.getInstance().highlightElement(EMPNAME);
		EMPNAME.click();
	}
	
//	public WebElement getEMPNAME() {
//		return EMPNAME;
//	}
	public void clickView() {
//		CommonUtils.getInstance().highlightElement(VIEW);
		VIEW.click();
	}
	
	public String getMessage() {
//		CommonUtils.getInstance().highlightElement(MESSAGE);
		return MESSAGE.getText();
	}
	

}
