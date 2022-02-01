package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends Pagebase {

	public EmailPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="FriendEmail")
	WebElement friendemail;
	@FindBy(id="YourEmailAddress")
	WebElement youremail;
	@FindBy(id="PersonalMessage")
	WebElement messageToFriend;
	@FindBy(css=".button-1.send-email-a-friend-button")
	WebElement sendEmailB;
	@FindBy(css="div.result")
	public WebElement resultSending;
	
	public void sendmessagetoFriedn(String emailo, String emailt, String mess) {
		fillfiled(friendemail, emailo);
		fillfiled(youremail, emailt);
		fillfiled(messageToFriend, mess);
		clickOnButton(sendEmailB);
		
	}
	

}
