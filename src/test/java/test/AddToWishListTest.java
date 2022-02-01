package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ProductDetilsPage;
import pages.SearchPage;
import pages.WishListPage;

public class AddToWishListTest extends TestBase {
	SearchPage search;
	ProductDetilsPage product;
	WishListPage wish;
	String emptyWL="The wishlist is empty!";

	public String productname="Apple MacBook Pro 13-inch";
	@Test(priority =1, description = "search product" )
	public void userCanSearchProduct() {
	search=new SearchPage(driver);
	search.searchproduct(productname);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
	}
	@Test(dependsOnMethods ="userCanSearchProduct")
	public void userCanAddToWishList() throws Exception {
	product =new ProductDetilsPage(driver);	
	wish=new WishListPage(driver);
	//String realprice=product.realprice.getText();
	product.addToWishList();
	product.goToList();
	//String priceinList=wish.priceinList.getText();
	//assertEquals(realprice, priceinList);
	//System.out.println("the firstone"+product.realprice.getText()+"the SC" +wish.priceinList.getText());
	wish.changeQ("0");
	assertTrue(wish.statusOfWL.getText().contains(emptyWL));
	}
	
}
