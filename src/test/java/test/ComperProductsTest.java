package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.ComperProductsPage;
import pages.ProductDetilsPage;
import pages.SearchPage;

public class ComperProductsTest extends TestBase {

	SearchPage search;
	ProductDetilsPage product;
	ComperProductsPage comper;
	JavascriptExecutor jse;

	public String productname="Apple MacBook Pro 13-inch";
	public String Productname2="Samsung Series 9 NP900X4C Premium Ultrabook";
	public String comperurl="https://demo.nopcommerce.com/compareproducts";
	
	
	@Test(priority = 1,description = "search the first product and add to comper")
	public void userCanSearchProduct() throws Exception {
	search=new SearchPage(driver);
	search.searchproduct(productname);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	//assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
	product.addTocomper();
	}	
	@Test(dependsOnMethods ="userCanSearchProduct" )
	
	public void gotocomperlist() throws Exception {
		product =new ProductDetilsPage(driver);
		product.gotoComperList();
	//driver.navigate().to(comperurl);
	}

	@Test(dependsOnMethods ="gotocomperlist" , description = "search the SC product and add to comper")
	public void userCanSearchProduct2() throws Exception {
	search=new SearchPage(driver);
	search.searchproduct(Productname2);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	product.addTocomper();
	}
	@Test(dependsOnMethods = "userCanSearchProduct2")
	public void gotocomperlist2() throws Exception {
		product =new ProductDetilsPage(driver);
		jse=(JavascriptExecutor)driver ;
		product.gotoComperList();
		//driver.navigate().to(comperurl);
		}
	@Test(dependsOnMethods ="gotocomperlist2" )
	public void compertable() throws Exception {
		comper=new ComperProductsPage(driver);
		comper.comperproducts();
		assertTrue(comper.FirstProduct.isDisplayed());
		assertTrue(comper.SCproduct.isDisplayed());
		comper.cleartable();
		assertTrue(comper.resultAfterClear.getText().contains("You have no items to compare."));
	}
	
	
	
}
