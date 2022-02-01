package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Pagebase {

	public CartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="input.qty-input")
	WebElement quant;
	@FindBy(css="button.button-2.update-cart-button")
	WebElement UpdateCart;
	@FindBy(id="termsofservice")
	WebElement AgreeWithTerms;
	@FindBy(id="checkout")
	WebElement CheckOutButton;
	@FindBy(id="checkout_attribute_1")
	WebElement GitWarpping;
	@FindBy(id="discountcouponcode")
	WebElement copoun;
	@FindBy(id="giftcardcouponcode")
	WebElement giftCardCode;
	@FindBy(css="div.message-error")
	public WebElement errorMessge;
	
	
	public void addquant(String num) {
		fillfiled(quant, num);
	}
	public void updateCart() {
		clickOnButton(UpdateCart);
	}
	public void AcceprtTermes() {
		clickOnButton(AgreeWithTerms);
		clickOnButton(CheckOutButton);
	}
	public void selectGitWarrping(String warpping) {
		selectvalue(GitWarpping, warpping);
	}

}
