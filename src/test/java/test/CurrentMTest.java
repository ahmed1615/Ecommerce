package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Homepage;
import pages.ProductDetilsPage;
import pages.SearchPage;

public class CurrentMTest extends TestBase{
	Homepage home;
	SearchPage search;
	ProductDetilsPage product ;
	public String productname="Apple MacBook Pro 13-inch";
	
	@Test(priority = 1,alwaysRun = true)
	public void userchangeCurrent() {
		home=new Homepage(driver);
		home.selectUro();
	}

	@Test(dependsOnMethods ="userchangeCurrent" )
	public void userCanSearchProduct() {
	search=new SearchPage(driver);
	search.searchproduct(productname);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
	assertTrue(product.changeprice.getText().contains("€"));
	System.out.println("the result is" +product.changeprice.getText());
	
	}
}
