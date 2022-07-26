package com.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.CommonUtils;

public class Loginpage {
	
	private static Loginpage LoginInstance;
	
	private Loginpage() {
		
	}
	public static Loginpage getInstance() {
		if(LoginInstance==null) {
			LoginInstance=new Loginpage();
			
		}
		return LoginInstance;
	}
	@FindBy(id="txtUsername")
	private WebElement USERNAME;
	
	@FindBy(id="txtPassword")
	private WebElement PASSWORD;
	
	@FindBy(id="btnLogin")
	private WebElement LOGIN_BUTTON;

//	public WebElement getUSERNAME() {
//		return USERNAME;
//	}
//
//	public WebElement getPASSWORD() {
//		return PASSWORD;
//	}
//
//	public WebElement getLOGIN_BUTTON() {
//		return LOGIN_BUTTON;
//	}
	
	public void enterUserName(String Username) {
		CommonUtils.getInstance().highlightElement(USERNAME);
		USERNAME.sendKeys(Username);
	}
	
	
	public void enterPassword(String Password) {
		CommonUtils.getInstance().highlightElement(PASSWORD);
		PASSWORD.sendKeys(Password);
	}
	
	
	public void clickLoginButton() {
		CommonUtils.getInstance().highlightElement(LOGIN_BUTTON);
		LOGIN_BUTTON.click();
	}
	
	
	
	
	
	

}
