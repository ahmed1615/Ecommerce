package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Pagebase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText="Change password")
	WebElement ChangePassword;
	@FindBy(id="OldPassword")
	WebElement oldpassword;
	@FindBy(id="NewPassword")
	WebElement newpassword;
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmnewpass;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	WebElement changePassButton;
	@FindBy(css="p.content")
	public WebElement passchangepass;
	public void changepass(String passwordold, String newpasswordone, String newpasswordtwo) {
		clickOnButton(ChangePassword);
		fillfiled(oldpassword, passwordold);
		fillfiled(newpassword, newpasswordone);
		fillfiled(confirmnewpass, newpasswordtwo);
		clickOnButton(changePassButton);
	}
}
