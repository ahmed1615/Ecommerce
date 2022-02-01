package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Pagebase{

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="small-searchterms")
	WebElement searchbox;
	@FindBy(css="button.button-1.search-box-button")
	WebElement searchButton;
	@FindBy(id="ui-id-1")
	WebElement productList;
	@FindBy(css="div.product-item")
	WebElement productTitle;
	
	public void  searchproduct(String itemname) {
		fillfiled(searchbox, itemname);
		clickOnButton(searchButton);
	}
	public void openproduct() {
		clickOnButton(productTitle);
	}
	

}
