package com.Bookcartproject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class BookScenariooutline extends BaseClass {
	public BookScenariooutline()
	{
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath=BookInterface.Login_button)
		private WebElement Login_button;
		@FindBy(xpath=BookInterface.Enter_Username)
		private WebElement Enter_Username;
		@FindBy(xpath=BookInterface.Enter_Password)
		private WebElement Enter_Password;
		@FindBy(xpath=BookInterface.Enter_button)
		private WebElement Enter_button;
		@FindBy(xpath=BookInterface.search_btn)
		private WebElement search_btn;
		@FindBy(xpath=BookInterface.book_option)
		private WebElement book_option;
		@FindBy(xpath=BookInterface.add_cart)
		private WebElement add_cart;
		
		public WebElement getLogin_button() {
			return Login_button;
		}
		public WebElement getEnter_Username() {
			return Enter_Username;
		}
		public WebElement getEnter_Password() {
			return Enter_Password;
		}
		public WebElement getEnter_button() {
			return Enter_button;
		}
		public WebElement getSearch_btn() {
			return search_btn;
		}
		public WebElement getBook_option() {
			return book_option;
		}
		public WebElement getAdd_cart() {
			return add_cart;
		}

		
}

