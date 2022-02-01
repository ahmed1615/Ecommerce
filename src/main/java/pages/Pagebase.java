package pages;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagebase {
	
	protected WebDriver driver;
	public Select select;
	protected Actions action;
	public JavascriptExecutor jse;
	
	
	public Pagebase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	protected WebDriver getDriver() {
        return driver;
    }

   
	public WebElement getElementExistNoWait2(By by) {
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            List<WebElement> elementos = getDriver().findElements(by);
            getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            if (elementos.isEmpty()) {
                return null;
            }
            return elementos.get(0);
        } catch (Exception e) {
           System.out.println(("Error to find the element: {}"+ by));
            getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            return null;
        }
    }

	public static void clickOnButton(WebElement element) {
		element.click();
	}
	public static void fillfiled(WebElement element, String value ) {
		if(element!=null) {
			element.clear();
			element.sendKeys(value);
			element.sendKeys(Keys.TAB);
		}
	}

	public static void selectvalue(WebElement element, String Value) {
	Select select=new Select(element);
	select.selectByVisibleText(Value);
	
	}
	public static void clearandfill(WebElement element, String value) {
		if(element!=null) {
			element.clear();
			element.sendKeys(value);	
		}
	}
	public static void filladdvalue(WebElement element, String value) {
		if(element!=null) {
			element.click();
			element.sendKeys(" "+value);
		}
		if(element.getText()==null) {
			element.click();
			element.sendKeys(value);
		}
	}
	public void scrolldownandclick(WebElement element) {
		//JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("scrollBy(0,2500)");
		element.click();
		//JavascriptExecutor ex = (JavascriptExecutor) getDriver();
	}
	
	public static void  selectvalueByvalue(WebElement element, String value) {
		
		Select select=new Select(element);
		select.selectByValue(value);
	}
	public static void hover_two_products(WebElement elemet, WebElement elemento) {
		
	}
	
}
	


