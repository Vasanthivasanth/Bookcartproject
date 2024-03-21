package Stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {
	WebDriver driver;

@Given("User enter the username as {string}")
public void userEnterTheUsernameAs(String string) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin"); 
}

@Given("User enter the password as {string}")
public void userEnterThePasswordAs(String string) {
   driver.findElement(By.name("password")).sendKeys("admin123");
}
@Given("user clicl the login button")
public void userCliclTheLoginButton() {
	driver.findElement(By.xpath("//*[@type='submit']")).click();
    
}
@When("Login should be success")
public void loginShouldBeSuccess() {
	String str=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).getText();
	Assert.assertEquals(str,"Login success");
	driver.quit();
   }


@Given("User enter the username  {string}")
public void userEnterTheUsername(String string) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin1");   
}

@Given("User enter the password  {string}")
public void userEnterThePassword(String string) {
	driver.findElement(By.name("password")).sendKeys("admin12");
}
@Given("user click the login button")
public void userClickTheLoginButton() {
	driver.findElement(By.xpath("//*[@type='submit']")).click();
    
   }

@When("Login should be failed")
public void loginShouldBeFailed() {
	String st1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
	Assert.assertEquals(st1,"Invalid credientials");
	driver.close();
   
}
}



	
	


