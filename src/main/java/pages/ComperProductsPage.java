package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComperProductsPage extends Pagebase {

	public ComperProductsPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css="a.clear-list")
	WebElement clearlist;
	@FindBy(css="table.compare-products-table")
	WebElement ProductsTable;
	@FindBy(tagName="tr")
	List<WebElement>allrows;
	@FindBy(tagName="td")
	List<WebElement>allcol;
	@FindBy(css="div.no-data")
	public WebElement resultAfterClear;
	@FindBy(linkText="Samsung Series 9 NP900X4C Premium Ultrabook")
	public WebElement FirstProduct;
	@FindBy(linkText="Samsung Series 9 NP900X4C Premium Ultrabook")
	public WebElement SCproduct;
	
	public void cleartable() throws Exception {
		Thread.sleep(5000);
		clickOnButton(clearlist);
	}
	public void comperproducts() {
		//how many row
		System.out.println(allrows.size());
		//all data from row
		for(WebElement row:allrows) {
			System.out.println(row.getText()+"\t");
			}
			for(WebElement col:allcol) {
				System.out.println(col.getText()+"\t");
			}
		}
	}

	

