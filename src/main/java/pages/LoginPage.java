package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Pagebase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="Email")
	WebElement emaill;
	@FindBy(id="Password")
	WebElement passwordd;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement loginButton;
	
	public void userLogin(String email, String password) {
		fillfiled(emaill, email);
		fillfiled(passwordd, password);
		
	}
	public void clicklogin() {
		clickOnButton(loginButton);
		
	}
	

}