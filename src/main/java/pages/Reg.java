package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reg extends Pagebase {

	public Reg(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="gender-male")
	WebElement man;
	@FindBy(id="FirstName")
	WebElement firstname;
	@FindBy(id="LastName")
	WebElement lastaname;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement day;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement month;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement year;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Company")
	WebElement companyName;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(id="ConfirmPassword")
	WebElement confirmPass;
	@FindBy(id="register-button")
	WebElement register;
	@FindBy(css="div.result")
	public WebElement messageb;
	@FindBy(linkText="Log out")
	WebElement logout;
	@FindBy(linkText="My account")
	WebElement myaccount;
	@FindBy(css="a.button-1.register-continue-button")
	WebElement Continue;
	
	public void setman() {
		clickOnButton(man);
	}
	public void setFNameLastName(String fname, String lname) {
		fillfiled(firstname, fname);
		fillfiled(lastaname, lname);
	}
	public void setbirthday(String dayy, String monthh, String yearr) {
		selectvalue(day, dayy);
		selectvalue(month, monthh);
		selectvalue(year, yearr);
	}
	public void setEmailCompanyname(String mail, String cname) {
		fillfiled(email, mail);
		fillfiled(companyName, cname);
	}
	public void setpassandpass(String pas, String passt) {
		fillfiled(password, pas);
		fillfiled(confirmPass, passt);
		clickOnButton(register);
		//clickOnButton(Continue);
	}
	public void logout() {
		clickOnButton(logout);
	}
	public void openMyAccount() {
		clickOnButton(myaccount);
	}
	
	
	
	
	
}
