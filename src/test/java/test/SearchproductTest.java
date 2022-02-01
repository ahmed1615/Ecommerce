package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ProductDetilsPage;
import pages.SearchPage;

public class SearchproductTest extends TestBase {
	SearchPage search;
	ProductDetilsPage product;

	public String productname="Apple MacBook Pro 13-inch";
	
	
	@Test
	public void userCanSearchProduct() {
	search=new SearchPage(driver);
	search.searchproduct(productname);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
	
	}
	
}
