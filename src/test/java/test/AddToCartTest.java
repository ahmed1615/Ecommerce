package test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.Homepage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.ProductDetilsPage;
import pages.Reg;
import pages.SearchPage;

public class AddToCartTest extends TestBase{

	public String productname="Apple MacBook Pro 13-inch";
	
	Homepage home;
	Reg re;
	LoginPage login;
	MyAccountPage acc;
	SearchPage search;
	ProductDetilsPage product;
	CartPage cart;
	@Test(priority = 1, alwaysRun =true )
	public void userRegester() {
		home=new Homepage(driver);
		re=new Reg(driver);
		login=new LoginPage(driver);
		home.clicreg();
		re.setman();
		re.setFNameLastName("ahmed", "mohmed");
		re.setbirthday("20", "May", "1990");
		re.setEmailCompanyname("ahmed.goo@gmail.com", "cool");
		re.setpassandpass("holahola", "holahola");
		assertEquals(re.messageb.getText(), "Your registration completed");
	}
	@Test(dependsOnMethods ="userRegester")
	public void userCanSearchProduct() {
	search=new SearchPage(driver);
	search.searchproduct(productname);
	search.openproduct();
	product =new ProductDetilsPage(driver);
	assertTrue(product.raelitem.getText().equalsIgnoreCase(productname));
	home=new Homepage(driver);
	product.addCart();
	home.gotoCart();
}
	@Test(dependsOnMethods ="userCanSearchProduct", description = "change number of quant to 1 ")
	public void ADDCRTOneProduct() {
		cart =new CartPage(driver);
		cart.addquant("1");
		cart.updateCart();
		assertTrue(cart.errorMessge.getText().contains("The minimum quantity allowed for purchase is 2."));
	}
	@Test(dependsOnMethods ="ADDCRTOneProduct", description ="get the pouduct and pruches it ")
	public void Addtocardandbuy() {
	cart =new CartPage(driver);
	cart.AcceprtTermes();
	}
}
