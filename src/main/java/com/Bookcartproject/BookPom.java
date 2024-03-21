package com.Bookcartproject;

import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class BookPom extends BaseClass {
	public BookPom() {
		PageFactory.initElements(driver, this);
		}
	private static BookPom pom;
	
	private LoginPass logp;
	private LoginFail logf;
	private  BookScenariooutline bsl;
	
	public static BookPom getPom() {
		if(pom==null) {
			pom=new BookPom();
		}
		return pom;
	}
	public LoginPass getLogp() {
		if(logp==null) {
			logp=new LoginPass();
		}
		return logp;
	}
	public LoginFail getLogf() {
		if(logf==null) {
			logf=new LoginFail();
		}
		return logf;
	}
	public BookScenariooutline getBsl() {
		if(bsl==null)
		{
			bsl=new BookScenariooutline();
		}
	
return bsl;

}
}
