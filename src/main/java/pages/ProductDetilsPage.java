package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetilsPage extends Pagebase {

	public ProductDetilsPage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver; 
		
	}
	
	@FindBy(css="strong.current-item")	
	public WebElement raelitem;
	@FindBy(css="button.button-2.email-a-friend-button")
	WebElement sendfriend;
	@FindBy(css="span#price-value-4")
	public WebElement changeprice;
	@FindBy(linkText="Add your review")
	WebElement productReview;
	@FindBy(id="add-to-wishlist-button-4")
	WebElement addToWishList;
	@FindBy(id="product_enteredQuantity_4")
	WebElement addquant;
	@FindBy(css="a.ico-wishlist")
	WebElement wishList;
	@FindBy(css="button.button-2.add-to-compare-list-button")
	WebElement addComper;
	@FindBy(linkText="Compare products list")
	WebElement comperlist;
	@FindBy(id="add-to-cart-button-4")
	WebElement AddCart;
	@FindBy(id="price-value-4")
	public WebElement realprice;
	
	

	public void clicksendtofriend() {
		clickOnButton(sendfriend);
	}
	
	public void clicProductR() {
		clickOnButton(productReview);
	}
	public void addToWishList() {
		clickOnButton(addToWishList);
	}
	public void addquant(String quant) {
		fillfiled(addquant, quant);
	}
	public void goToList() throws Exception {
		Thread.sleep(5000);
		clickOnButton(wishList);
	}
	public void addTocomper() throws Exception {
		Thread.sleep(6000);
		clickOnButton(addComper);
	}
	public void gotoComperList() throws Exception {
		Thread.sleep(6000);
		//clickOnButton(comperlist);
		scrolldownandclick(comperlist);
	}
	public void addCart() {
		clickOnButton(AddCart);
	}
	
	
	
	
}
