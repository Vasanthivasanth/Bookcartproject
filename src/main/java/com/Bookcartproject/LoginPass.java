package com.Bookcartproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class LoginPass extends BaseClass {
	public LoginPass() {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath=BookInterface.Login_btn)
private WebElement Login_btn;
@FindBy(xpath=BookInterface.Username)
private WebElement Username;
@FindBy(xpath=BookInterface.Password)
private WebElement Password;
@FindBy(xpath=BookInterface.Enter_btn)
private WebElement Enter_btn;

public WebElement getLogin_btn() {
	return Login_btn;
}
public WebElement getUsername() {
	return Username;
}
public WebElement getPassword() {
	return Password;
}
public WebElement getEnter_btn() {
	return Enter_btn;
}

}
