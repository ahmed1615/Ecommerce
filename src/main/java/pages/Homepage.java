package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase{

	public Homepage(WebDriver driver) {
		super(driver);	
		jse=(JavascriptExecutor)driver;
		action= new Actions(driver);
	}
	
	@FindBy(linkText="Register")
	WebElement registerbutton;
	@FindBy(linkText="Log in")
	WebElement loging;
	@FindBy(linkText="Contact us")
	WebElement contactUs;
	@FindBy(id="customerCurrency")
	WebElement changeCurrency;
	@FindBy(linkText="Computers")
	WebElement compo;
	@FindBy(linkText="Notebooks")
	WebElement notebooks;
	@FindBy(css="span.cart-label")
	WebElement Cart;
	
	


	public void clicreg() {
		clickOnButton(registerbutton);
	}

	public void clickLogin() {
		clickOnButton(loging);
	}
	public void openContactUs() {
		scrolldownandclick(contactUs);
		
	}
	public void selectUro() {
		selectvalue(changeCurrency, "Euro");
	}
	
	public void entercompo() throws Exception{
		action.moveToElement(compo).build().perform();
		Thread.sleep(5000);
		action.moveToElement(notebooks)
		.click()
		.build().perform();
	}
	public void gotoCart() {
		clickOnButton(Cart);
	}


}
	