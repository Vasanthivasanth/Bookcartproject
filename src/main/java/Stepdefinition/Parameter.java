package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter {
	WebDriver driver;
	@Given("user enter the valid username {string}")
	public void userEnterTheValidUsername(String username) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\driver1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
	   }

	@Given("user enter the valid password {string}")
	public void userEnterTheValidPassword(String password) {
	   driver.findElement(By.name("password")).sendKeys(password); 
	}
	
	@When("The login page navigated successfuly")
	public void theLoginPageNavigatedSuccessfuly() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   System.out.println("The login page successsfully navigated");
	   driver.close();
	}


}