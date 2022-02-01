package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccInfo extends Pagebase {

	
	public MyAccInfo(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText="Customer info")
	WebElement customerinfo;
	@FindBy(id="gender-male")
	WebElement malegenro;
	@FindBy(id="gender-female")
	WebElement femalegenro;
	@FindBy(id="FirstName")
	WebElement firstname;
	@FindBy(id="LastName")
	WebElement lastname;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement day;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement month;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement year;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="save-info-button")
	WebElement saveButton;
	
	public void opencustomerinfo() {
		clickOnButton(customerinfo);
	}
	
	public void selectgenero(String gen) {
		if(gen=="man") {
			clickOnButton(malegenro);
		}
		else if(gen=="woman") {
			clickOnButton(femalegenro);
		}
		else {
			clickOnButton(malegenro);
		}
	}
	public void addFnameLname(String fname, String lname ) {
		filladdvalue(firstname, fname);
		filladdvalue(lastname, lname);
	}
	public void changeFnameLname(String fname, String lname) {
		fillfiled(firstname, lname);
		fillfiled(lastname, lname);
	}
	public void changefecha(String dia, String mes, String ano) {
		selectvalue(day, dia);
		selectvalue(month, mes);
		selectvalue(year, ano);
	}
	public void changeEmail(String mail) {
		clearandfill(email, mail);
	}
	public void savedata() {
		clickOnButton(saveButton);
	}

}
