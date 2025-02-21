package stepDefenitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageFactory.LoginPage_PF;

public class steps {
	WebDriver driver = new ChromeDriver();
	LoginPage_PF login = new LoginPage_PF(driver);
	
	
	@Given("user opens the application")
	public void open_browser() {
	    
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.manage().window().maximize();
	    
	}


	@When("user enter login credentials {string} and {string}")
	public void enter_login_credentials(String username, String password) {
		
		login.enter_username(username);
		login.enter_password(password);
		
//		driver.findElement(By.id("inputUsername")).sendKeys(username);
//		driver.findElement(By.name("inputPassword")).sendKeys(password);
	
	}

	@And("user clicks on the login button")
	public void click_login_btn()  {
		
		login.click_sign_btn();
		
//		driver.findElement(By.className("signInBtn")).click();
		
	}

	@Then("user should be redirected to account home page")
	public void verify_successful_login() throws InterruptedException {
		
		login.verify_txt();
		
		
//		driver.findElement(By.tagName("p")).getText();
//		System.out.println(driver.findElement(By.tagName("p")).getText());
		
	}


}
