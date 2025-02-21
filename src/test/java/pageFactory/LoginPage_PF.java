package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id="inputUsername")
	WebElement txt_username;
	
	@FindBy(name="inputPassword")
	WebElement txt_password;
	
	@FindBy(className="signInBtn")
	WebElement txt_btn;
	
	@FindBy(tagName="p")
	WebElement text_p;
	
	//-------------constructor------------
	WebDriver driver;
	public LoginPage_PF(WebDriver driver)   
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//----------methods for seprate actions-------
	
	public void enter_username(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enter_password(String password) {
		txt_password.sendKeys(password);
	}
	
	public void click_sign_btn()  {
		txt_btn.click();
		
	}
	
	public void verify_txt() throws InterruptedException {
		text_p.getText();
		Thread.sleep(2000);
		System.out.println(text_p.getText());
		driver.close();
	}
	
	
	
	

}
