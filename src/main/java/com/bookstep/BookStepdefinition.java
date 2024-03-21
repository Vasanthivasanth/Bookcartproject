package com.bookstep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Base.BaseClass;
import com.Bookcartproject.BookPom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookStepdefinition extends BaseClass {
	BookPom pom=new BookPom();
	WebDriverWait wait;
	@Given("Launch the browser {string}")
	public void launchTheBrowser(String browserName) {
		browserLaunch(browserName);
	}
	@When("Navigate to the Bookcart application {string}")
	public void navigateToTheBookcartApplication(String url) {
		launchUrl(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Given("User click the login button")
	public void userClickTheLoginButton() {
		elementClick(pom.getLogp().getLogin_btn());
	    
	}
	@Then("user enter the username {string}")
	public void userEnterTheUsername(String username) {
	    
		//elementClick(pom.getLogp().getUsername());
		Input(pom.getLogp().getUsername(),username);
	    }
	@Then("user enter the password {string}")
	public void userEnterThePassword(String password) {
	 // elementClick(pom.getLogp().getPassword());
	  Input(pom.getLogp().getPassword(),password);
	    }
	@When("User click or enter the login button")
	public void userClickOrEnterTheLoginButton() {
	    elementClick(pom.getLogp().getEnter_btn());
	    
	}
	@Then("Login should be successful")
	public void loginShouldBeSuccessful() {
	System.out.println("Login should be successful");
	close();
		}
	@Given("User click login btn1")
	public void userClickLoginBtn1() {
	   elementClick(pom.getLogf().getLogin_btn1());
	    }
	@Then("user enter the Username1 {string}")
	public void userEnterTheUsername1(String username ) {
	 Input(pom.getLogf().getUsername1(),username); 
	    
	}
	@Then("user enter the Password1 {string}")
	public void userEnterThePassword1(String password) {
	   Input(pom.getLogf().getPassword1(),password);
	    
	}
	@When("user click the login button1")
	public void userClickTheLoginButton1() {
	   elementClick(pom.getLogf().getEnter_btn1());
	    
	}
	@Then("Login should be failed")
	public void loginShouldBeFailed() {
		System.out.println("login should be faild");
driver.close();
	   
	    }
	@Given("User click the login btn")
	public void userClickTheLoginBtn() throws InterruptedException {
		elementClick(pom.getBsl().getLogin_button());
	   }
	@Then("User enter the {string}")
	public void userEnterThe(String username) {
		Input(pom.getBsl().getEnter_Username(),username);
	    }
	@Then("User enter {string}")
	public void userEnter(String password) {
		Input(pom.getBsl().getEnter_Password(),password);
	    }
	@When("Click the login button")
	public void clickTheLoginButton() {
		elementClick(pom.getBsl().getEnter_button());
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(pom.getBsl().getEnter_button()));
	     }
	@Then("user search the {string}")
	public void userSearchThe(String book) throws InterruptedException {
	    elementClick(pom.getBsl().getSearch_btn());
	    wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(pom.getBsl().getSearch_btn()));
	    Input(pom.getBsl().getBook_option(),book);
	    wait.until(ExpectedConditions.visibilityOf(pom.getBsl().getBook_option()));
	   }
	@Then("user add the book into cart")
	public void userAddTheBookIntoCart() {
	    
	 elementClick(pom.getBsl().getAdd_cart());
	 String addcart=driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[5]")).getText();
	System.out.println(addcart);
	}
}
