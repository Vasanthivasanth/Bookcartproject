package com.Bookcartproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class LoginFail extends BaseClass {
	
	public LoginFail() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath=BookInterface.Login_btn1)
private WebElement Login_btn1;
@FindBy(xpath=BookInterface.Username1)
private WebElement Username1;
@FindBy(xpath=BookInterface.Password1)
private WebElement Password1;
@FindBy(xpath=BookInterface.Enter_btn1)
private WebElement Enter_btn1;

public WebElement getLogin_btn1() {
	return Login_btn1;
}
public WebElement getUsername1() {
	return Username1;
}
public WebElement getPassword1() {
	return Password1;
}
public WebElement getEnter_btn1() {
	return Enter_btn1;
}
}
