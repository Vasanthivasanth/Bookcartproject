package com.Bookcartproject;

public interface BookInterface {
	//Login successful
	String Login_btn="//span[text()=' Login ']";
	String Username="//input[@placeholder='Username']";
	String Password="//input[@placeholder='Password']";
	String Enter_btn="//span[text()='Login']";
	
	//Login failed
	String Login_btn1="//span[text()=' Login ']";
	String Username1="//input[@placeholder='Username']";
	String Password1="//input[@placeholder='Password']";
	String Enter_btn1="//span[text()='Login']";
	
//Bookcart scenario oluline
	String Login_button="//span[text()=' Login ']";
	String Enter_Username="//input[@placeholder='Username']";
	String Enter_Password="//input[@placeholder='Password']";
	String Enter_button="//span[text()='Login']";
	String search_btn="//input[@type='search']";
	String book_option="//*[@id=\"mat-option-7\"]";
	String add_cart="/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[5]";
}
