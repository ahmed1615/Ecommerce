package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends Pagebase {

	public WishListPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css="span.product-unit-price")
	public WebElement priceinList;
	@FindBy(xpath="//input[@class='qty-input']")
	WebElement changeQ;
	@FindBy(css="button.button-2.update-wishlist-button")
	WebElement updateWL;
	@FindBy(css="div.no-data")
	public WebElement statusOfWL;
	
	
	public void changeQ(String zero) throws Exception {
		Thread.sleep(5000);
		fillfiled(changeQ, zero);
		clickOnButton(updateWL);
	}

}
