package Bookcart;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepbook {
	
	WebDriver driver;
	@Given("Existing User click the login button")
	public void existingUserClickTheLoginButton() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://bookcart.azurewebsites.net/");
	    driver.findElement(By.xpath("//span[text()='Login']"));
	}
	
	@Given("user enter the {string} and {string}")
	public void userEnterTheAnd(String username, String password) {
		driver.findElement(By.id("mat-input-0")).sendKeys(username);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);   
	}

	@Given("Click the login button")
	public void clickTheLoginButton() {
		driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
	    
	   }
	@Given("search the book name {string}")
	public void searchTheBookName(String Book) {
	WebElement sendke=driver.findElement(By.xpath("//input[@type='search']"));
	sendke.sendKeys(Book+Keys.ENTER);
	
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	@Given("Add the book into Add to cart")
	public void addTheBookIntoAddToCart() {
	    driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content[2]/app-addtocart/button/span[1]")).click();
	   
	}
	@When("Verify the book added into the cart")
	public void verifyTheBookAddedIntoTheCart() {
		String text=driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]")).getText();
		
	    Assert.assertEquals(Integer.parseInt(text)>0,true);
	    driver.quit();
	   
	}
}
