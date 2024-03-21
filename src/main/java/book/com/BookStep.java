package book.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BookStep {
	WebDriver driver;
	
	@Given("user navigate the bookcart appliction")
	public void userNavigateTheBookcartAppliction() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	   
	}
@Given("User clicks on the login button")
	public void userClicksOnTheLoginButton() {
	
	driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	}
	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(username);
	}
	@Given("user enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
	    
	}
	@When("user click the login button")
	public void userClickTheLoginButton() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	   
	}
	@Then("Login should be success")
	public void loginShouldBeSuccess() {
	System.out.println("Login successfully completed");
	driver.close();
	   }
@Given("User enter the username")
	public void userEnterTheUsername() {
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("vasantha");
	}

	@Given("user enter the password")
	public void userEnterThePassword() {
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Vasa123");
		}
	@Then("login should be fail")
	public void loginShouldBeFail() {
		String errormsg=driver.findElement(By.xpath("//*[contains(text(),'Username or Password')]")).getText();
	    System.out.println(errormsg);
	    driver.close();
	}
	@Given("user clicks login button")
	public void userClicksLoginButton() {
System.out.println("============Scenario outline==========");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\driver1\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://bookcart.azurewebsites.net/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[text()=' Login ']")).click();

	}
	@Then("user enter the username {string}")
	public void userEnterTheUsername(String Username) {
		driver.findElement(By.xpath("//*[@formcontrolname='username']")).sendKeys(Username);
			}
	@Then("user enter the password {string}")
	public void userEnterThePassword(String Password) {
		driver.findElement(By.xpath("//*[@formcontrolname='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	@When("user search the book {string}")
	public void userSearchTheBook(String Book) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Book);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@role='option']")).click();
	    
	}
	@SuppressWarnings("deprecation")
	@When("add the book into the cart")
	public void addTheBookIntoTheCart() {
		driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content/app-addtocart/button/span[5]")).click();
		String count=driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[1]/button/span[5]")).getText();
	    Assert.assertEquals(Integer.parseInt(count)>0,true);
	    driver.close();
	}

}



