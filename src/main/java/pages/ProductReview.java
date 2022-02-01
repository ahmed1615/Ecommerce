package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReview extends Pagebase{

	public ProductReview(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="AddProductReview_Title")
	WebElement reviewTitle;
	@FindBy(id="AddProductReview_ReviewText")
	WebElement reviewText;
	@FindBy(id="addproductrating_1")
	WebElement bad0;
	@FindBy(id="addproductrating_2")
	WebElement bad1;
	@FindBy(id="addproductrating_3")
	WebElement notbadnotgood;
	@FindBy(id="addproductrating_4")
	WebElement good;
	@FindBy(id="addproductrating_5")
	WebElement excellent;
	@FindBy(css="button.button-1.write-product-review-button")
	WebElement buttonReview;
	@FindBy(css="div.result")
	public WebElement result_of_review;
	
	
	public void sendRtitleRtext(String title, String text) {
		fillfiled(reviewTitle, title);
		fillfiled(reviewText, text);
		
	}
	public void choosequality(String value) {
		if(value=="so bad") {
			clickOnButton(bad0);
		}
		else if(value=="bad") {
			clickOnButton(bad1);
		}
		else if (value=="not bad not good") {
			clickOnButton(notbadnotgood);
		}
		else if (value=="good") {
			clickOnButton(good);
		}
		else if (value=="excllent")
			clickOnButton(excellent);
		else
			clickOnButton(excellent);	
	}
	public void click_review_done() {
		clickOnButton(buttonReview);
	
	}
}
