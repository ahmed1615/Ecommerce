package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Pagebase {

	public CheckOutPage(WebDriver driver) {
		super(driver);
		jse=(JavascriptExecutor)driver;
	}
	
	

}
