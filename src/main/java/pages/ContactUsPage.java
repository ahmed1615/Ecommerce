package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Pagebase{
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="FullName")
	WebElement name;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Enquiry")
	WebElement enquiry;
	@FindBy(css="button.button-1.contact-us-button")
	WebElement submitButton;
	@FindBy(css="div.result")
	public WebElement message;
	public void sendUs(String namee, String emaill, String messageS) {
		fillfiled(name, namee);
		fillfiled(email, emaill);
		fillfiled(enquiry, messageS);
		clickOnButton(submitButton);
	}
	
}
